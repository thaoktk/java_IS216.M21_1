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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author asus
 */
public class HoaDonDAO {
    public static ArrayList<HoaDon> getHoaDonAll() {
        ArrayList<HoaDon> arr = new ArrayList<HoaDon>();
        String SQL = "{ call GET_HOADON_ALL(?) }";
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
        String SQL = "{ call GET_HOADON_SOHD_MAX(?) }";

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
        try {
            String SQL = "{? = call INSERT_CTHD(?, ?, ?)}";

            ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, java.sql.Types.INTEGER);
            ps.setInt(2, hd.getSoHD());
            ps.setInt(3, hd.getMaSP());
            ps.setInt(4, hd.getSoLuong());
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
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
                    SQL = "{ call GET_HOADON_SOHD(?, ?) }";
                    break;
                case "Mã NV":
                    SQL = "{ call GET_HOADON_MANV(?, ?) }";
                    break;
                case "Mã KH":
                    SQL = "{ call GET_HOADON_MAKH(?, ?) }";
                    break;
            }

            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
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
    
    public static HoaDon getChiTietHoaDon(int value) {
        HoaDon hd = new HoaDon();
        String SQL = "{ call GET_HOADON_SOHD(?, ?) }";
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            CallableStatement ps = con.prepareCall(SQL);
            ps.setInt(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
            if (rs.next()) {
                hd.setMaNV(rs.getInt("MANV"));
                hd.setSoHD(rs.getInt("SOHD"));
                hd.setMaKH(rs.getInt("MAKH"));
                hd.setChietKhau(rs.getFloat("CHIETKHAU"));
                hd.setTongTien(rs.getDouble("TONGTIEN"));
                hd.setTriGia(rs.getDouble("TRIGIAHD"));
                hd.setNgayHD(rs.getDate("NGAYHD").toLocalDate());
            }
            
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return hd;
    }
}
