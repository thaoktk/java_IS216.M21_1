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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

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
        con.close();

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
        con.close();

        return check > 0;
    }

    public static boolean delete(String value) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionUtils.getMyConnection();
        CallableStatement ps = null;
        con.setAutoCommit(false);
        try {
            String SQL = "{? = call DELETE_KHACHHANG(?)}";
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

    public static ArrayList<KhachHang> getKhachHangAll() {
        ArrayList<KhachHang> arr = new ArrayList<KhachHang>();
        String SQL = "{ call GET_KHACHHANG_ALL(?) }";

        try (Connection con = ConnectionUtils.getMyConnection()) {
            CallableStatement ps = con.prepareCall(SQL);
            ps.registerOutParameter(1, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(1);
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
                SQL = "{ call GET_KHACHHANG_BY_MAKH(?, ?) }";
                break;
            case "Họ tên":
                SQL = "{ call GET_KHACHHANG_BY_HOTEN(?, ?) }";
                break;
            case "SĐT":
                SQL = "{ call GET_KHACHHANG_BY_SDT(?, ?) }";
                break;
            case "Loại KH":
                SQL = "{ call GET_KHACHHANG_BY_LOAIKH(?, ?) }";
                break;
        }
        try (Connection con = ConnectionUtils.getMyConnection()) {
            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
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

            String SQL = "{ call GET_KHACHHANG_BY_MAKH(?, ?) }";
            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
            if (rs.next()) {
                loaiKH = rs.getString("LOAIKH");
            }
            
            if (loaiKH.equals("Moi")) {
                return 1;
            } else if (loaiKH.equals("Than thiet")) {
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

            String SQL = "{ call GET_KHACHHANG_BY_MAKH(?, ?) }";
            CallableStatement ps = con.prepareCall(SQL);
            ps.setString(1, value);
            ps.registerOutParameter(2, OracleTypes.CURSOR);
            ps.execute();
            ResultSet rs = (ResultSet) ps.getObject(2);
            if (rs.next()) {
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM");
                ngaySinh = dateFormat.format(rs.getDate("NGAYSINH").toLocalDate());
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ngaySinh;
    }
    
    public static String getTenKH(String value) {
        String tenKH = null;
        String SQL = "{ call GET_KHACHHANG_BY_MAKH(?, ?) }";
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
                tenKH = rs.getString("HOTEN");
            }
            
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tenKH;
    }
}
