/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.KhachHang;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class KhachHangDAO {

    public static boolean insert(KhachHang kh) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String NgS = kh.toString(kh.getNgSinh());

        String SQL = "{? = call INSERT_KHACHHANG(?, ?, ?, to_date(?,'dd/mm/yyyy'), ?, ?)}";
        
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setString(2, kh.getHoTen());
        ps.setString(3, kh.getSDT());
        ps.setString(4, kh.getDiaChi());
        ps.setString(5, NgS);
        ps.setString(6, kh.getGhiChu());
        ps.setString(7, kh.getGioiTinh());
        ps.executeUpdate();
        int check = ps.getInt(1);

        return check > 0;
    }

    public static boolean update(KhachHang kh) throws SQLException {
        String SQL = "{? = call UPDATE_KHACHHANG(?, ?, ?, ?, to_date(?,'dd/mm/yyyy'), ?, ?)}";
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String NgS = kh.toString(kh.getNgSinh());

        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setInt(2, kh.getMaKH());
        ps.setString(3, kh.getHoTen());
        ps.setString(4, kh.getSDT());
        ps.setString(5, kh.getDiaChi());
        ps.setString(6, NgS);
        ps.setString(7, kh.getGhiChu());
        ps.setString(8, kh.getGioiTinh());
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

        String SQL = "{? = call DELETE_KHACHHANG(?)}";
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setString(2, value);
        ps.executeUpdate();
        int check = ps.getInt(1);
        
        return check > 0;
    }

    public static ArrayList<KhachHang> getKhachHangAll() {
        ArrayList<KhachHang> arr = new ArrayList<KhachHang>();
        String SQL = "SELECT MAKH, HOTEN, SDT, DIACHI, NGAYSINH, NGAYDK, LOAIKH, TICHLUY, GHICHU, GIOITINH FROM KHACHHANG ORDER BY MAKH";

        try (Connection con = ConnectionUtils.getMyConnection()) {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getInt("MAKH"));
                kh.setHoTen(rs.getString("HOTEN"));
                kh.setDiaChi(rs.getString("DIACHI"));
                kh.setSDT(rs.getString("SDT"));
                kh.setNgSinh(rs.getDate("NGAYSINH").toLocalDate());
                kh.setNgDK(rs.getDate("NGAYDK").toLocalDate());
                kh.setTichLuy(rs.getInt("TICHLUY"));
                kh.setLoaiKH(rs.getString("LOAIKH"));
                kh.setGhiChu(rs.getString("GHICHU"));
                kh.setGioiTinh(rs.getString("GIOITINH"));
                arr.add(kh);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return arr;
    }

    public static ArrayList<KhachHang> timKhachHang(String option, String value) {
        ArrayList<KhachHang> arr = new ArrayList<KhachHang>();
        String SQL = null;
        switch (option) {
            case "Mã KH":
                SQL = "SELECT MAKH, HOTEN, SDT, DIACHI, NGAYSINH, NGAYDK, LOAIKH, TICHLUY, GHICHU, GIOITINH FROM KHACHHANG WHERE MAKH=?";
                break;
            case "Họ tên":
                SQL = "SELECT MAKH, HOTEN, SDT, DIACHI, NGAYSINH, NGAYDK, LOAIKH, TICHLUY, GHICHU, GIOITINH FROM KHACHHANG WHERE HOTEN=?";
                break;
            case "SĐT":
                SQL = "SELECT MAKH, HOTEN, SDT, DIACHI, NGAYSINH, NGAYDK, LOAIKH, TICHLUY, GHICHU, GIOITINH FROM KHACHHANG WHERE SDT=?";
                break;
            case "Loại KH":
                SQL = "SELECT MAKH, HOTEN, SDT, DIACHI, NGAYSINH, NGAYDK, LOAIKH, TICHLUY, GHICHU, GIOITINH FROM KHACHHANG WHERE LOAIKH=?";
                break;
        }
        try (Connection con = ConnectionUtils.getMyConnection()) {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang temp = new KhachHang();
                temp.setMaKH(rs.getInt("MAKH"));
                temp.setHoTen(rs.getString("HOTEN"));
                temp.setDiaChi(rs.getString("DIACHI"));
                temp.setSDT(rs.getString("SDT"));
                temp.setNgSinh(rs.getDate("NGAYSINH").toLocalDate());
                temp.setNgDK(rs.getDate("NGAYDK").toLocalDate());
                temp.setTichLuy(rs.getInt("TICHLUY"));
                temp.setLoaiKH(rs.getString("LOAIKH"));
                temp.setGhiChu(rs.getString("GHICHU"));
                temp.setGioiTinh(rs.getString("GIOITINH"));

                arr.add(temp);
            }

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static int getLoaiKH(String value) {
        String loaiKH = null;
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            String SQL = "SELECT LOAIKH FROM KHACHHANG\n"
                    + "WHERE MAKH=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                loaiKH = rs.getString("LOAIKH");
            }
            
            if (loaiKH.equals("Bình thường")) {
                return 1;
            } else if (loaiKH.equals("Thân thiết")) {
                return 2;
            } else {
                return 3;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    
    public static String getNgaySinh(String value) {
        String ngaySinh = null;
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            String SQL = "SELECT NGAYSINH FROM KHACHHANG\n"
                    + "WHERE MAKH=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM");
                ngaySinh = dateFormat.format(rs.getDate("NGAYSINH").toLocalDate());
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ngaySinh;
    }
}
