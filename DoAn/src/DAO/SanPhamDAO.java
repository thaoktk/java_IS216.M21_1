/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.SanPham;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;
import java.sql.PreparedStatement;
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
        con.close();

        return check > 0;
    }

    public static boolean update(SanPham sp) throws SQLException {
        try {
            Connection con = ConnectionUtils.getMyConnection();
            CallableStatement ps = null;
            try {
                String SQL = "{? = call UPDATE_SANPHAM(?, ?, ?, ?, ?, ?, ?, ?)}";

                ps = con.prepareCall(SQL);
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
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            int check = ps.getInt(1);
            con.close();

            return check > 0;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean delete(String value) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        CallableStatement ps = null;
        try {
            String SQL = "{? = call DELETE_SANPHAM(?)}";
            ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, java.sql.Types.INTEGER);
            ps.setString(2, value);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        int check = ps.getInt(1);
        con.close();
        return check > 0;
    }

    public static ArrayList<SanPham> getSanPhamAll() {
        ArrayList<SanPham> arr = new ArrayList<SanPham>();
        String SQL = "SELECT SP.*, LSP.TENLOAISP FROM SANPHAM SP, LOAISANPHAM LSP WHERE SP.MALOAISP = LSP.MALOAISP ORDER BY MASP";

        Connection con = null;
        Statement ps = null;
        try {
            con = ConnectionUtils.getMyConnection();
            ps = con.createStatement();
            ResultSet rs = ps.executeQuery(SQL);
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getInt("MASP"));
                sp.setTenSP(rs.getString("TENSP"));
                sp.setGiaSP(rs.getLong("GIA"));
                sp.setTenLSP(rs.getString("TENLOAISP"));
                sp.setMauSac(rs.getString("MAUSAC"));
                sp.setSlsan(rs.getInt("SLSAN"));
                sp.setGhiChu(rs.getString("GHICHU"));
                arr.add(sp);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arr;
    }

    public static SanPham getChiTietSanPham(int value) {
        String SQL = "{ call GET_SANPHAM_CHITIET(?, ?) }";
        SanPham sp = new SanPham();
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
                    SQL = "SELECT SP.*, LSP.TENLOAISP FROM SANPHAM SP, LOAISANPHAM LSP WHERE SP.MALOAISP = LSP.MALOAISP AND MASP=? ORDER BY MASP";
                    break;
                case "Tên SP":
                    SQL = "SELECT SP.*, LSP.TENLOAISP FROM SANPHAM SP, LOAISANPHAM LSP WHERE SP.MALOAISP = LSP.MALOAISP AND TENSP=? ORDER BY MASP";
                    break;
                case "Màu sắc":
                    SQL = "SELECT SP.*, LSP.TENLOAISP FROM SANPHAM SP, LOAISANPHAM LSP WHERE SP.MALOAISP = LSP.MALOAISP AND MAUSAC=? ORDER BY MASP";
                    break;
                case "Tên loại SP":
                    SQL = "SELECT SP.*, LSP.TENLOAISP FROM SANPHAM SP, LOAISANPHAM LSP WHERE SP.MALOAISP = LSP.MALOAISP AND LSP.TENLOAISP=? ORDER BY MASP";
                    break;
            }

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham temp = new SanPham();
                temp.setMaSP(rs.getInt("MASP"));
                temp.setTenSP(rs.getString("TENSP"));
                temp.setGiaSP(rs.getLong("GIA"));
                temp.setTenLSP(rs.getString("TENLOAISP"));
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
        String SQL = "{ call GET_SANPHAM_MASP(?, ?) }";

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
                anhSP = rs.getString("ANHSP");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return anhSP;
    }

    public static String getTenSP(int value) {
        String tenSP = null;
        String SQL = "{ call GET_SANPHAM_MASP(?, ?) }";

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
                tenSP = rs.getString("TENSP");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return tenSP;
    }

    public static ArrayList<String> getTenLSP() {
        ArrayList<String> arr = new ArrayList<String>();
        String SQL = "{ call GET_LOAISANPHAM_ALL(?) }";

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
        String SQL = "{ call GET_LOAISANPHAM_TENLOAISP(?, ?) }";
        int maSP = 0;
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
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
        String SQL = "{ call GET_LOAISANPHAM_MALOAISP(?, ?) }";
        String tenSP = null;
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
                tenSP = rs.getString("TENLOAISP");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return tenSP;
    }

    public static int getMaSP(String value) {
        String SQL = "{ call GET_SANPHAM_TENSP(?, ?) }";
        int maSP = 0;
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
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
        String SQL = "{ call GET_SANPHAM_ALL(?) }";

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
                String tenSP = rs.getString("TENSP");
                arr.add(tenSP);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }

    public static int getSoLuong(String value) {
        String SQL = "{ call GET_SANPHAM_SOLUONG(?, ?) }";
        int Soluong = 0;
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
            if (rs.next()) {
                Soluong = rs.getInt("SOLUONG");
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return Soluong;
    }

    public static ArrayList<SanPham> getSanPhamHoaDon(String value) {
        ArrayList<SanPham> arr = new ArrayList<SanPham>();
        String SQL = "{ call GET_SANPHAM_HOADON(?, ?) }";

        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getInt("MASP"));
                sp.setTenSP(rs.getString("TENSP"));
                sp.setGiaSP(rs.getLong("GIA"));
                sp.setMaLoaiSP(rs.getInt("MALOAISP"));
                sp.setMauSac(rs.getString("MAUSAC"));
                sp.setSlsan(rs.getInt("SOLUONG"));
                sp.setGhiChu(rs.getString("GHICHU"));
                arr.add(sp);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arr;
    }
}
