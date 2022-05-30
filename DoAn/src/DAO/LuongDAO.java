/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.Luong;
import java.sql.CallableStatement;
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
public class LuongDAO {
    public static ArrayList<Luong> getLuongAll() {
        ArrayList<Luong> arr = new ArrayList<Luong>();
        String SQL = "SELECT THANG, NAM, MANV, SOGIOLAMTC, SOGIOLAMTT, LUONG FROM LUONG ORDER BY MANV, THANG, NAM";

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
                Luong km = new Luong();
                km.setMaNV(rs.getInt("MANV"));
                km.setThang(rs.getInt("THANG"));
                km.setNam(rs.getInt("NAM"));
                km.setSoGioLamTT(rs.getDouble("SOGIOLAMTT"));
                km.setSoGioLamTC(rs.getDouble("SOGIOLAMTC"));
                km.setLuong(rs.getDouble("LUONG"));

                arr.add(km);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static ArrayList<Integer> getMaNV() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String SQL = "SELECT MANV FROM NHANVIEN ORDER BY MANV";

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
                int maNV = rs.getInt("MANV");
                arr.add(maNV);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static boolean tinhLuong(Luong luong) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionUtils.getMyConnection();
        CallableStatement ps = null;
        con.setAutoCommit(false);
        try {
            String SQL = "{? = call INSERT_LUONG(?, ?, ?)}";

            ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, java.sql.Types.INTEGER);
            ps.setInt(3, luong.getThang());
            ps.setInt(4, luong.getNam());
            ps.setInt(2, luong.getMaNV());
            ps.executeUpdate();
            con.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        int check = ps.getInt(1);
        con.close();

        return check > 0;
    }
    
    public static ArrayList<Luong> timLuong(String option, String value) {
        ArrayList<Luong> arr = new ArrayList<Luong>();
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            String SQL = null;
            switch (option) {
                case "Mã NV":
                    SQL = "SELECT THANG, NAM, MANV, SOGIOLAMTC, SOGIOLAMTT, LUONG FROM LUONG WHERE MANV=? ORDER BY MANV";
                    break;
                case "Tháng":
                    SQL = "SELECT THANG, NAM, MANV, SOGIOLAMTC, SOGIOLAMTT, LUONG FROM LUONG WHERE THANG=? ORDER BY MANV";
                    break;
                case "Năm":
                    SQL = "SELECT THANG, NAM, MANV, SOGIOLAMTC, SOGIOLAMTT, LUONG FROM LUONG WHERE NAM=? ORDER BY MANV";
                    break;
            }

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Luong km = new Luong();
                km.setMaNV(rs.getInt("MANV"));
                km.setThang(rs.getInt("THANG"));
                km.setNam(rs.getInt("NAM"));
                km.setSoGioLamTT(rs.getDouble("SOGIOLAMTT"));
                km.setSoGioLamTC(rs.getDouble("SOGIOLAMTC"));
                km.setLuong(rs.getDouble("LUONG"));
                
                arr.add(km);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static int getThangLuong() {
        int thang = 0;
        String SQL = "SELECT MAX(THANG) FROM LUONG";

        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            if (rs.next()) {
                thang = rs.getInt("MAX(THANG)");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return thang;
    }
}
