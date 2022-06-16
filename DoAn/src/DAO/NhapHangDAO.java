/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.NhapHang;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author asus
 */
public class NhapHangDAO {
    public static ArrayList<NhapHang> getNhapHangAll() {
        ArrayList<NhapHang> arr = new ArrayList<NhapHang>();
        String SQL = "{ call GET_PHIEUNHAP_ALL(?) }";

        try (Connection con = ConnectionUtils.getMyConnection()) {
            CallableStatement ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(1);
            while (rs.next()) {
                NhapHang kh = new NhapHang();
                kh.setMaPN(rs.getInt("MAPHIEUNHAP"));
                kh.setMaNCC(rs.getInt("MANCC"));
                kh.setMaNV(rs.getInt("MANV"));
                kh.setTongTienNhap(rs.getDouble("TONGTIENNHAP"));
                kh.setNgayNhap(rs.getDate("NGAYNHAP").toLocalDate());
                arr.add(kh);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static ArrayList<NhapHang> getSPNhapHangAll(String value) {
        ArrayList<NhapHang> arr = new ArrayList<NhapHang>();
        String SQL = "{ call GET_CTPN_ALL(?, ?) }";

        try (Connection con = ConnectionUtils.getMyConnection()) {
            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
            while (rs.next()) {
                NhapHang kh = new NhapHang();
                kh.setMaSP(rs.getInt("MASP"));
                kh.setSlNhap(rs.getInt("SLNHAP"));
                kh.setGiaNhap(rs.getLong("GIANHAP"));
                arr.add(kh);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static ArrayList<NhapHang> getSanPhamNhapHang(String value) {
        ArrayList<NhapHang> arr = new ArrayList<NhapHang>();
        String SQL = "{ call GET_PHIEUNHAP_MAPN(?, ?) }";

        try (Connection con = ConnectionUtils.getMyConnection()) {
            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
            while (rs.next()) {
                NhapHang kh = new NhapHang();
                kh.setMaPN(rs.getInt("MAPHIEUNHAP"));
                kh.setMaNCC(rs.getInt("MANCC"));
                kh.setMaNV(rs.getInt("MANV"));
                kh.setTongTienNhap(rs.getDouble("TONGTIENNHAP"));
                kh.setNgayNhap(rs.getDate("NGAYNHAP").toLocalDate());
                arr.add(kh);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static ArrayList<NhapHang> timNhapHang(String option, String value) {
        ArrayList<NhapHang> arr = new ArrayList<NhapHang>();
        String SQL = null;
        switch (option) {
            case "Mã PN":
                SQL = "{ call GET_PHIEUNHAP_MAPN(?, ?) }";
                break;
            case "Mã NV":
                SQL = "{ call GET_PHIEUNHAP_MANV(?, ?) }";
                break;
        }
        try (Connection con = ConnectionUtils.getMyConnection()) {
            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
            while (rs.next()) {
                NhapHang kh = new NhapHang();
                kh.setMaPN(rs.getInt("MAPHIEUNHAP"));
                kh.setMaNCC(rs.getInt("MANCC"));
                kh.setMaNV(rs.getInt("MANV"));
                kh.setTongTienNhap(rs.getDouble("TONGTIENNHAP"));
                kh.setNgayNhap(rs.getDate("NGAYNHAP").toLocalDate());
                arr.add(kh);
            }

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static boolean insert(NhapHang nh) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "{? = call INSERT_PHIEUNHAP(?, ?)}";

        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setInt(3, nh.getMaNV());
        ps.setInt(2, nh.getMaNCC());
        ps.executeUpdate();
        int check = ps.getInt(1);
        con.close();

        return check > 0;
    }
    
    public static boolean insertCTPN(NhapHang nh) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "{? = call INSERT_CTPN(?, ?, ?, ?)}";

        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setInt(2, nh.getMaSP());
        ps.setInt(3, nh.getMaPN());
        ps.setInt(4, nh.getSlNhap());
        ps.setLong(5, nh.getGiaNhap());
        ps.executeUpdate();
        int check = ps.getInt(1);
        con.close();

        return check > 0;
    }
    
    public static int getMaPN() {
        int maPN = 0;
        String SQL = "{ call GET_PHIEUNHAP_MAPHIEUNHAP_MAX(?) }";

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
                maPN = rs.getInt("MAX(MAPHIEUNHAP)");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return maPN;
    }
    
    
}
