/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.DoiTac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class DoiTacDAO {
    public static boolean insert(DoiTac dt) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "INSERT INTO NHACUNGCAP(MANCC, TENNCC, DIACHI, SDT)"
                + " VALUES(SEQ5_MANCC.NEXTVAL, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(SQL);
        ps.setString(1, dt.getTenDT());
        ps.setString(2, dt.getDiaChi());
        ps.setString(3, dt.getSDT());

        return ps.executeUpdate() > 0;
    }

    public static boolean update(DoiTac dt) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "UPDATE NHACUNGCAP SET TENNCC=?, DIACHI=?, SDT=?"
                + "WHERE MANCC=?";
        PreparedStatement ps = con.prepareStatement(SQL);
        ps.setInt(4, dt.getMaDT());
        ps.setString(1, dt.getTenDT());
        ps.setString(2, dt.getDiaChi());
        ps.setString(3, dt.getSDT());

        return ps.executeUpdate() > 0;
    }

    public static boolean delete(String value) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "DELETE FROM NHACUNGCAP WHERE MANCC=?";
        PreparedStatement ps = con.prepareStatement(SQL);
        ps.setString(1, value);
        return ps.executeUpdate() > 0;
    }

    public static ArrayList<DoiTac> getDoiTacAll() {
        ArrayList<DoiTac> arr = new ArrayList<DoiTac>();
        String SQL = "SELECT MANCC, TENNCC, DIACHI, SDT FROM NHACUNGCAP ORDER BY MANCC";

        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {
                DoiTac dt = new DoiTac();
                dt.setMaDT(rs.getInt("MANCC"));
                dt.setTenDT(rs.getString("TENNCC"));
                dt.setDiaChi(rs.getString("DIACHI"));
                dt.setSDT(rs.getString("SDT"));
                arr.add(dt);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }

    public static ArrayList<DoiTac> timDoiTac(String option, String value) {
        ArrayList<DoiTac> arr = new ArrayList<DoiTac>();
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            String SQL = null;
            switch (option) {
                case "Mã NCC":
                    SQL = "SELECT MANCC, TENNCC, DIACHI, SDT FROM NHACUNGCAP WHERE MANCC=?";
                    break;
                case "Tên NCC":
                    SQL = "SELECT MANCC, TENNCC, DIACHI, SDT FROM NHACUNGCAP WHERE TENNCC=?";
                    break;
                case "SĐT":
                    SQL = "SELECT MANCC, TENNCC, DIACHI, SDT FROM NHACUNGCAP WHERE SDT=?";
                    break;
            }

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DoiTac temp = new DoiTac();
                temp.setMaDT(rs.getInt("MANCC"));
                temp.setTenDT(rs.getString("TENNCC"));
                temp.setDiaChi(rs.getString("DIACHI"));
                temp.setSDT(rs.getString("SDT"));
                arr.add(temp);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static ArrayList<String> getTenDT() {
        ArrayList<String> arr = new ArrayList<String>();
        String SQL = "SELECT TENNCC FROM NHACUNGCAP ORDER BY MANCC";

        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {
                String tenDT = rs.getString("TENNCC");
                arr.add(tenDT);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static int getMaDT(String value) {
        String SQL = "SELECT MANCC FROM NHACUNGCAP WHERE TENNCC=?";
        int maDT = 0;
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                maDT = rs.getInt("MANCC");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return maDT;
    }
}