/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.HoaDon;
import DTO.NhapHang;
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
public class HoaDonDAO {
    public static ArrayList<HoaDon> getHoaDonAll() {
        ArrayList<HoaDon> arr = new ArrayList<HoaDon>();
        String SQL = "SELECT SOHD, MANV,MAKH,NGAYHD,TONGTIEN,CHIETKHAU,TRIGIAHD FROM HOADON ORDER BY SOHD";
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
                HoaDon hd = new HoaDon();
                hd.setMaNV(rs.getInt("MANV"));
                hd.setSoHD(rs.getInt("SOHD"));
                hd.setMaKH(rs.getInt("MAKH"));
                hd.setChietKhau(rs.getFloat("CHIETKHAU"));
                hd.setTongTien(rs.getDouble("TONGTIEN"));
                hd.setTriGia(rs.getDouble("TRIGIAHD"));
                hd.setNgayHD(rs.getDate("NGAYHD").toLocalDate());
                arr.add(hd);
            }
            
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return arr;
    }
    
    public static boolean insert(HoaDon hd) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "INSERT INTO HOADON(SOHD, MANV, MAKH) VALUES(SEQ7_SOHD.NEXTVAL, ?, ?)";
        PreparedStatement ps = con.prepareStatement(SQL);
        ps.setInt(1, hd.getMaNV());
        if (hd.getMaKH() != null) {
            ps.setInt(2, hd.getMaKH());
        } else {
            ps.setObject(2, hd.getMaKH());
        }
        

        return ps.executeUpdate() > 0;
    }
    
    public static int getSoHD() {
        int soHD = 0;
        String SQL = "SELECT MAX(SOHD) FROM HOADON";

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
                soHD = rs.getInt("MAX(SOHD)");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return soHD;
    }
    
    public static boolean insertCTHD(HoaDon hd) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "INSERT INTO CTHD(SOHD,MASP,SOLUONG) VALUES(?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(SQL);
        ps.setInt(1, hd.getSoHD());
        ps.setInt(2, hd.getMaSP());
        ps.setInt(3, hd.getSoLuong());

        return ps.executeUpdate() > 0;
    } 
    
    public static boolean insertCTKM(HoaDon hd) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "INSERT INTO CTKM(SOHD, MAKM) VALUES(?, ?)";
        PreparedStatement ps = con.prepareStatement(SQL);
        ps.setInt(1, hd.getSoHD());
        ps.setInt(2, hd.getMaKM());

        return ps.executeUpdate() > 0;
    } 
}
