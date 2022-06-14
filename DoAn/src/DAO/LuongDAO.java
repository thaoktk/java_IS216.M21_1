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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;
import java.sql.Statement;

/**
 *
 * @author asus
 */
public class LuongDAO {

    public static ArrayList<Luong> getLuongAll() {
        ArrayList<Luong> arr = new ArrayList<Luong>();
        String SQL = "{ call GET_LUONG_ALL(?) }";

        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            CallableStatement ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(1);
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
        String SQL = "{ call GET_NHANVIEN_ALL(?) }";

        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            CallableStatement ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(1);
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

    public static boolean deleteLuong() throws SQLException, ClassNotFoundException {
        Connection con = ConnectionUtils.getMyConnection();
        Statement ps = null;
        String SQL = "DELETE FROM LUONG WHERE THANG = (EXTRACT(MONTH FROM SYSDATE)) AND NAM = (EXTRACT(YEAR FROM SYSDATE))";
        ps = con.createStatement();
        int check = ps.executeUpdate(SQL);
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
                    SQL = "{ call GET_LUONG_MANV(?, ?) }";
                    break;
                case "Tháng":
                    SQL = "{ call GET_LUONG_THANG(?, ?) }";
                    break;
                case "Năm":
                    SQL = "{ call GET_LUONG_NAM(?, ?) }";
                    break;
            }

            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
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
        String SQL = "{ call GET_LUONG_THANG_MAX(?) }";

        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            CallableStatement ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(1);
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
