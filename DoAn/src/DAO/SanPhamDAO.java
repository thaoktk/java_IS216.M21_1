/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.SanPham;
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
public class SanPhamDAO {

    public static boolean insert(SanPham sp) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "{? = call INSERT_SANPHAM(?, ?, ?, ?, ?, ?, ?)}";
        
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setString(2, sp.getTenSP());
        ps.setLong(3, sp.getGiaSP());
        ps.setInt(4, sp.getMaLoaiSP());
        ps.setString(5, sp.getMauSac());
        ps.setInt(6, sp.getSlsan());
        ps.setString(7, sp.getGhiChu());
        ps.setString(8, sp.getAnhSP());
        ps.executeUpdate();
        int check = ps.getInt(1);

        return check > 0;
    }

    public static boolean update(SanPham sp) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "{? = call UPDATE_SANPHAM(?, ?, ?, ?, ?, ?, ?, ?)}";
        
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setInt(2, sp.getMaSP());
        ps.setString(3, sp.getTenSP());
        ps.setLong(4, sp.getGiaSP());
        ps.setInt(5, sp.getMaLoaiSP());
        ps.setString(6, sp.getMauSac());
        ps.setInt(7, sp.getSlsan());
        ps.setString(8, sp.getGhiChu());
        ps.setString(9, sp.getAnhSP());
        ps.executeUpdate();
        int check = ps.getInt(1);

        return check > 0;
    }

    public static boolean delete(String value) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "{? = call DELETE_SANPHAM(?)}";
        
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setString(2, value);
        ps.executeUpdate();
        int check = ps.getInt(1);
        
        return check > 0;
    }

    public static ArrayList<SanPham> getSanPhamAll() {
        ArrayList<SanPham> arr = new ArrayList<SanPham>();
        String SQL = "SELECT MASP, TENSP, GIA, MALOAISP, MAUSAC, SLSAN, GHICHU FROM SANPHAM ORDER BY MASP";

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
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getInt("MASP"));
                sp.setTenSP(rs.getString("TENSP"));
                sp.setGiaSP(rs.getLong("GIA"));
                sp.setMaLoaiSP(rs.getInt("MALOAISP"));
                sp.setMauSac(rs.getString("MAUSAC"));
                sp.setSlsan(rs.getInt("SLSAN"));
                sp.setGhiChu(rs.getString("GHICHU"));
                arr.add(sp);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }

    public static SanPham getChiTietSanPham(int value) {
        String SQL = "SELECT MASP, TENSP, GIA, MALOAISP, MAUSAC, SLSAN, GHICHU, ANHSP FROM SANPHAM WHERE MASP=?";
        SanPham sp = new SanPham();
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, value);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                SanPham temp = new SanPham();
                temp.setMaSP(rs.getInt("MASP"));
                temp.setTenSP(rs.getString("TENSP"));
                temp.setGiaSP(rs.getLong("GIA"));
                temp.setMaLoaiSP(rs.getInt("MALOAISP"));
                temp.setMauSac(rs.getString("MAUSAC"));
                temp.setSlsan(rs.getInt("SLSAN"));
                temp.setGhiChu(rs.getString("GHICHU"));
                temp.setAnhSP(rs.getString("ANHSP"));

                sp = temp;
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return sp;
    }

    public static ArrayList<SanPham> timSanPham(String option, String value) {
        ArrayList<SanPham> arr = new ArrayList<SanPham>();
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            String SQL = null;
            switch (option) {
                case "Mã SP":
                    SQL = "SELECT MASP, TENSP, GIA, MALOAISP, MAUSAC, SLSAN, GHICHU FROM SANPHAM WHERE MASP=?";
                    break;
                case "Tên SP":
                    SQL = "SELECT MASP, TENSP, GIA, MALOAISP, MAUSAC, SLSAN, GHICHU FROM SANPHAM WHERE TENSP=?";
                    break;
                case "Màu sắc":
                    SQL = "SELECT MASP, TENSP, GIA, MALOAISP, MAUSAC, SLSAN, GHICHU FROM SANPHAM WHERE MAUSAC=?";
                    break;
                case "Tên loại SP":
                    SQL = "SELECT MASP, TENSP, GIA, SP.MALOAISP, MAUSAC, SLSAN, GHICHU \n"
                            + "FROM SANPHAM SP\n"
                            + "WHERE MALOAISP = (SELECT MALOAISP FROM LOAISANPHAM WHERE TENLOAISP=?)";
                    break;
            }

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham temp = new SanPham();
                temp.setMaSP(rs.getInt("MASP"));
                temp.setTenSP(rs.getString("TENSP"));
                temp.setGiaSP(rs.getLong("GIA"));
                temp.setMaLoaiSP(rs.getInt("MALOAISP"));
                temp.setMauSac(rs.getString("MAUSAC"));
                temp.setSlsan(rs.getInt("SLSAN"));
                temp.setGhiChu(rs.getString("GHICHU"));
                arr.add(temp);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static String getAnhSP(int value) {
        String anhSP = null;
        String SQL = "SELECT ANHSP FROM SANPHAM WHERE MASP=?";
        
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, value);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                anhSP = rs.getString("ANHSP");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return anhSP;
    }
    
    public static ArrayList<String> getTenLSP() {
        ArrayList<String> arr = new ArrayList<String>();
        String SQL = "SELECT TENLOAISP FROM LOAISANPHAM ORDER BY MALOAISP";

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
                String tenSP = rs.getString("TENLOAISP");
                arr.add(tenSP);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static int getMaLSP(String value) {
        String SQL = "SELECT MALOAISP FROM LOAISANPHAM WHERE TENLOAISP=?";
        int maSP = 0;
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
                maSP = rs.getInt("MALOAISP");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return maSP;
    }
    
    public static String getTenLSP(int value) {
        String SQL = "SELECT TENLOAISP FROM LOAISANPHAM WHERE MALOAISP=?";
        String tenSP = null;
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, value);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tenSP = rs.getString("TENLOAISP");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return tenSP;
    }
    
    public static int getMaSP(String value) {
        String SQL = "SELECT MASP FROM SANPHAM WHERE TENSP=?";
        int maSP = 0;
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
                maSP = rs.getInt("MASP");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return maSP;
    }
    
    public static ArrayList<String> getTenSP() {
        ArrayList<String> arr = new ArrayList<String>();
        String SQL = "SELECT TENSP FROM SANPHAM ORDER BY MASP";

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
                String tenSP = rs.getString("TENSP");
                arr.add(tenSP);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
}
