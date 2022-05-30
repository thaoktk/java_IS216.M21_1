/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.HoaDon;
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
    
    public static boolean insert(HoaDon hd) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionUtils.getMyConnection();
        CallableStatement ps = null;
        con.setAutoCommit(false);
        try {
            String SQL = "{? = call INSERT_HOADON(?, ?)}";

            ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, java.sql.Types.INTEGER);
            ps.setInt(2, hd.getMaNV());
            if (hd.getMaKH() != null) {
                ps.setInt(3, hd.getMaKH());
            } else {
                ps.setObject(3, hd.getMaKH());
            }
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
    
    public static boolean insertCTHD(HoaDon hd) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionUtils.getMyConnection();
        CallableStatement ps = null;
        con.setAutoCommit(false);
        try {
            String SQL = "{? = call INSERT_CTHD(?, ?, ?)}";

            ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, java.sql.Types.INTEGER);
            ps.setInt(2, hd.getSoHD());
            ps.setInt(3, hd.getMaSP());
            ps.setInt(4, hd.getSoLuong());
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
    
    public static boolean insertCTKM(HoaDon hd) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "{? = call INSERT_CTKM(?, ?)}";
        
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setInt(2, hd.getSoHD());
        ps.setInt(3, hd.getMaKM());
        ps.executeUpdate();
        int check = ps.getInt(1);
        con.close();

        return check > 0;
    } 
    
    public static ArrayList<HoaDon> timHoaDon(String option, String value) {
        ArrayList<HoaDon> arr = new ArrayList<HoaDon>();
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            String SQL = null;
            switch (option) {
                case "Số HD":
                    SQL = "SELECT SOHD, MANV,MAKH,NGAYHD,TONGTIEN,CHIETKHAU,TRIGIAHD FROM HOADON WHERE SOHD=?";
                    break;
                case "Mã NV":
                    SQL = "SELECT SOHD, MANV,MAKH,NGAYHD,TONGTIEN,CHIETKHAU,TRIGIAHD FROM HOADON WHERE MANV=?";
                    break;
                case "Mã KH":
                    SQL = "SELECT SOHD, MANV,MAKH,NGAYHD,TONGTIEN,CHIETKHAU,TRIGIAHD FROM HOADON WHERE MAKH=?";
                    break;
            }

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
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
}
