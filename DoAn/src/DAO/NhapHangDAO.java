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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class NhapHangDAO {
    public static ArrayList<NhapHang> getNhapHangAll() {
        ArrayList<NhapHang> arr = new ArrayList<NhapHang>();
        String SQL = "SELECT PN.MAPHIEUNHAP, MANCC, NGAYNHAP, MANV, TONGTIENNHAP, MASP, SLNHAP, GIANHAP FROM PHIEUNHAP PN, CTPN"
                + " WHERE PN.MAPHIEUNHAP = CTPN.MAPHIEUNHAP ORDER BY PN.MAPHIEUNHAP";

        try (Connection con = ConnectionUtils.getMyConnection()) {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {
                NhapHang kh = new NhapHang();
                kh.setMaPN(rs.getInt("MAPHIEUNHAP"));
                kh.setMaNCC(rs.getInt("MANCC"));
                kh.setMaSP(rs.getInt("MASP"));
                kh.setMaNV(rs.getInt("MANV"));
                kh.setTongTienNhap(rs.getDouble("TONGTIENNHAP"));
                kh.setNgayNhap(rs.getDate("NGAYNHAP").toLocalDate());
                kh.setSlNhap(rs.getInt("SLNHAP"));
                kh.setGiaNhap(rs.getDouble("GIANHAP"));
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
                SQL = "SELECT PN.MAPHIEUNHAP, MANCC, NGAYNHAP, MANV, TONGTIENNHAP, MASP, SLNHAP, GIANHAP FROM PHIEUNHAP PN, CTPN"
                + " WHERE PN.MAPHIEUNHAP = CTPN.MAPHIEUNHAP AND PN.MAPHIEUNHAP=?";
                break;
            case "Mã NV":
                SQL = "SELECT PN.MAPHIEUNHAP, MANCC, NGAYNHAP, MANV, TONGTIENNHAP, MASP, SLNHAP, GIANHAP FROM PHIEUNHAP PN, CTPN"
                + " WHERE PN.MAPHIEUNHAP = CTPN.MAPHIEUNHAP AND MANV=?";
                break;
            case "Mã SP":
                SQL = "SELECT PN.MAPHIEUNHAP, MANCC, NGAYNHAP, MANV, TONGTIENNHAP, MASP, SLNHAP, GIANHAP FROM PHIEUNHAP PN, CTPN"
                + " WHERE PN.MAPHIEUNHAP = CTPN.MAPHIEUNHAP AND MASP=?";
                break;
        }
        try (Connection con = ConnectionUtils.getMyConnection()) {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhapHang kh = new NhapHang();
                kh.setMaPN(rs.getInt("MAPHIEUNHAP"));
                kh.setMaNCC(rs.getInt("MANCC"));
                kh.setMaSP(rs.getInt("MASP"));
                kh.setMaNV(rs.getInt("MANV"));
                kh.setTongTienNhap(rs.getDouble("TONGTIENNHAP"));
                kh.setNgayNhap(rs.getDate("NGAYNHAP").toLocalDate());
                kh.setSlNhap(rs.getInt("SLNHAP"));
                kh.setGiaNhap(rs.getDouble("GIANHAP"));
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

        String NgN = nh.toString(nh.getNgayNhap());

        String SQL = "{? = call INSERT_PHIEUNHAP(?, to_date(?,'dd/mm/yyyy'), ?)}";

        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setInt(4, nh.getMaNV());
        ps.setString(3, NgN);
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
        String SQL = "SELECT MAX(MAPHIEUNHAP) FROM PHIEUNHAP";

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
                maPN = rs.getInt("MAX(MAPHIEUNHAP)");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return maPN;
    }
}
