/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.KhuyenMai;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class KhuyenMaiDAO {

    public static boolean insert(KhuyenMai km) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String NgBD = km.toString(km.getNgBD());
        String NgKT = km.toString(km.getNgKT());

        String SQL = "{? = call INSERT_KHUYENMAI(?, ?, to_date(?,'dd/mm/yyyy HH24:MI:SS'), to_date(?,'dd/mm/yyyy HH24:MI:SS'))}";
        
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setString(2, km.getTenKM());
        ps.setFloat(3, km.getPhanTram());
        if (!NgBD.equals("") && !NgKT.equals("")) {
            ps.setString(4, NgBD);
            ps.setString(5, NgKT);
        } else {
            ps.setString(4, null);
            ps.setString(5, null);
        }
        ps.executeUpdate();
        int check = ps.getInt(1);
        con.close();

        return check > 0;
    }

    public static boolean update(KhuyenMai km) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String NgBD = km.toString(km.getNgBD());
        String NgKT = km.toString(km.getNgKT());

        String SQL = "{? = call UPDATE_KHUYENMAI(?, ?, ?, to_date(?,'dd/mm/yyyy HH24:MI:SS'), to_date(?,'dd/mm/yyyy HH24:MI:SS'))}";

        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setInt(2, km.getMaKM());
        ps.setString(3, km.getTenKM());
        ps.setFloat(4, km.getPhanTram());
        if (!NgBD.equals("") && !NgKT.equals("")) {
            ps.setString(5, NgBD);
            ps.setString(6, NgKT);
        } else {
            ps.setString(5, null);
            ps.setString(6, null);
        }
        ps.executeUpdate();
        int check = ps.getInt(1);
        con.close();

        return check > 0;
    }

    public static boolean delete(String value) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionUtils.getMyConnection();
        CallableStatement ps = null;
        con.setAutoCommit(false);
        try {
            String SQL = "{? = call DELETE_KHUYENMAI(?)}";
            ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, java.sql.Types.INTEGER);
            ps.setString(2, value);
            ps.executeUpdate();
            con.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            con.rollback();
        }
        int check = ps.getInt(1);
        con.close();
        return check > 0;
    }

    public static ArrayList<KhuyenMai> getKhuyenMaiAll() {
        ArrayList<KhuyenMai> arr = new ArrayList<KhuyenMai>();
        String SQL = "SELECT MAKM, TENKM, PHANTRAM, NGAYBD, NGAYKT FROM KHUYENMAI ORDER BY MAKM";

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
                KhuyenMai km = new KhuyenMai();
                km.setMaKM(rs.getInt("MAKM"));
                km.setTenKM(rs.getString("TENKM"));
                km.setPhanTram(rs.getFloat("PHANTRAM"));
                if (rs.getDate("NGAYBD") != null && rs.getDate("NGAYKT") != null) {
                    km.setNgBD(Instant.ofEpochMilli(rs.getDate("NGAYBD").getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());
                    km.setNgKT(Instant.ofEpochMilli(rs.getDate("NGAYKT").getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());
                }

                arr.add(km);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static ArrayList<KhuyenMai> getKhuyenMaiHopLeAll() {
        ArrayList<KhuyenMai> arr = new ArrayList<KhuyenMai>();
        String SQL = "SELECT MAKM, TENKM, PHANTRAM, NGAYBD, NGAYKT FROM KHUYENMAI WHERE NGAYBD <= SYSDATE AND "
                + "NGAYKT >= SYSDATE OR NGAYBD IS NULL ORDER BY MAKM";

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
                KhuyenMai km = new KhuyenMai();
                km.setMaKM(rs.getInt("MAKM"));
                km.setTenKM(rs.getString("TENKM"));
                km.setPhanTram(rs.getFloat("PHANTRAM"));
                if (rs.getDate("NGAYBD") != null && rs.getDate("NGAYKT") != null) {
                    km.setNgBD(Instant.ofEpochMilli(rs.getDate("NGAYBD").getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());
                    km.setNgKT(Instant.ofEpochMilli(rs.getDate("NGAYKT").getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());
                }

                arr.add(km);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }

    public static ArrayList<KhuyenMai> timKhuyenMai(String option, String value) {
        ArrayList<KhuyenMai> arr = new ArrayList<KhuyenMai>();
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            String SQL = null;
            switch (option) {
                case "Mã KM":
                    SQL = "SELECT MAKM, TENKM, PHANTRAM, NGAYBD, NGAYKT FROM KHUYENMAI WHERE MAKM=?";
                    break;
                case "Tên KM":
                    SQL = "SELECT MAKM, TENKM, PHANTRAM, NGAYBD, NGAYKT FROM KHUYENMAI WHERE TENKM=?";
                    break;
                case "Phần trăm":
                    SQL = "SELECT MAKM, TENKM, PHANTRAM, NGAYBD, NGAYKT FROM KHUYENMAI WHERE PHANTRAM=?";
                    break;
            }

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhuyenMai temp = new KhuyenMai();
                temp.setMaKM(rs.getInt("MAKM"));
                temp.setTenKM(rs.getString("TENKM"));
                temp.setPhanTram(rs.getFloat("PHANTRAM"));
                if (rs.getDate("NGAYBD") != null && rs.getDate("NGAYKT") != null) {
                    temp.setNgBD(Instant.ofEpochMilli(rs.getDate("NGAYBD").getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());
                    temp.setNgKT(Instant.ofEpochMilli(rs.getDate("NGAYKT").getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());
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
