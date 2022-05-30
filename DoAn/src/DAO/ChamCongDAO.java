/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.ChamCong;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author asus
 */
public class ChamCongDAO {

    public static boolean insert(int value) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionUtils.getMyConnection();
        CallableStatement ps = null;
        try {
            String SQL = "{? = call INSERT_CHAMCONG(?)}";

            ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, java.sql.Types.INTEGER);
            ps.setInt(2, value);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        int check = ps.getInt(1);
        return check > 0;
    }

    public static boolean update(int value) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionUtils.getMyConnection();
        CallableStatement ps = null;
        try {
            String SQL = "{? = call UPDATE_CHAMCONG(?)}";
            ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, java.sql.Types.INTEGER);
            ps.setInt(2, value);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        int check = ps.getInt(1);
        return check > 0;
    }

    public static ArrayList<ChamCong> getChamCongAll() {
        ArrayList<ChamCong> arr = new ArrayList<ChamCong>();
        String SQL = "{ call GET_CHAMCONG_ALL(?) }";

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
                ChamCong km = new ChamCong();
                km.setMaNV(rs.getInt("MANV"));
                km.setSoGioLamThem(rs.getDouble("SOGIOLAM"));
                if (rs.getDate("CHECKIN") != null) {
                    km.setCheckIn(Instant.ofEpochMilli(rs.getDate("CHECKIN").getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());
                }
                if (rs.getDate("CHECKOUT") != null) {
                    km.setCheckOut(Instant.ofEpochMilli(rs.getDate("CHECKOUT").getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());
                }

                arr.add(km);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }

    public static String getCheckIn(String user) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime CheckIn = null;

        String SQL = "{ call GET_CHAMCONG_CHECKIN_MAX(?, ?) }";
        String ngaycheckIn = null;
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, user);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
            if (rs.next()) {
                CheckIn = Instant.ofEpochMilli(rs.getDate("MAX(CHECKIN)").getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
                ngaycheckIn = CheckIn.format(dateFormat);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ngaycheckIn;
    }
    
    public static String getCheckOut(String user) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime CheckOut = null;

        String SQL = "{ call GET_CHAMCONG_CHECKOUT_MAX(?, ?) }";
        String ngaycheckOut = null;
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, user);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
            if (rs.next()) {
                CheckOut = Instant.ofEpochMilli(rs.getDate("MAX(CHECKOUT)").getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
                ngaycheckOut = CheckOut.format(dateFormat);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ngaycheckOut;
    }
    
    public static ArrayList<ChamCong> timChamCong(String option, String value) {
        ArrayList<ChamCong> arr = new ArrayList<ChamCong>();
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
                    SQL = "{ call GET_CHAMCONG_MANV(?, ?) }";
                    break;
            }

            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
            while (rs.next()) {
                ChamCong temp = new ChamCong();
                temp.setMaNV(rs.getInt("MANV"));
                temp.setSoGioLamThem(rs.getDouble("SOGIOLAM"));
                if (rs.getDate("CHECKIN") != null) {
                    temp.setCheckIn(Instant.ofEpochMilli(rs.getDate("CHECKIN").getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());
                }
                if (rs.getDate("CHECKOUT") != null) {
                    temp.setCheckOut(Instant.ofEpochMilli(rs.getDate("CHECKOUT").getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());
                }

                arr.add(temp);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
}
