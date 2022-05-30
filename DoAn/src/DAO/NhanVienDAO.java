/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.NhanVien;
import View.LogIn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.CallableStatement;

/**
 *
 * @author asus
 */
public class NhanVienDAO {

    public static boolean insert(NhanVien nv) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String NgS = nv.toString(nv.getNgSinh());
        String NgVL = nv.toString(nv.getNgVaoLam());
        String SQL = "{? = call INSERT_NHANVIEN(?, ?, ?, ?, to_date(?,'dd/mm/yyyy'), to_date(?,'dd/mm/yyyy'), ?, ?, ?)}";
        
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setString(2, nv.getHoTen());
        ps.setString(3, nv.getDiaChi());
        ps.setString(4, nv.getSDT());
        ps.setString(5, nv.getCMND());
        ps.setString(6, NgS);
        ps.setString(7, NgVL);
        ps.setInt(8, nv.getLuongCoBan());
        ps.setString(9, nv.getChucVu());
        ps.setString(10, nv.getGioiTinh());
        ps.executeUpdate();
        int check = ps.getInt(1);

        return check > 0;
    }

    public static boolean update(NhanVien nv) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String NgS = nv.toString(nv.getNgSinh());
        String NgVL = nv.toString(nv.getNgVaoLam());

        String SQL = "{? = call UPDATE_NHANVIEN(?, ?, ?, ?, ?, to_date(?,'dd/mm/yyyy'), to_date(?,'dd/mm/yyyy'), ?, ?, ?)}";
        
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setInt(2, nv.getMaNV());
        ps.setString(3, nv.getHoTen());
        ps.setString(4, nv.getDiaChi());
        ps.setString(5, nv.getSDT());
        ps.setString(6, nv.getCMND());
        ps.setString(7, NgS);
        ps.setString(8, NgVL);
        ps.setInt(9, nv.getLuongCoBan());
        ps.setString(10, nv.getChucVu());
        ps.setString(11, nv.getGioiTinh());
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
            String SQL = "{? = call DELETE_NHANVIEN(?)}";
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

    public static ArrayList<NhanVien> getNhanVienAll() {
        ArrayList<NhanVien> arr = new ArrayList<NhanVien>();
        String SQL = "SELECT MANV, HOTEN, DIACHI, SDT, CMND, NGAYSINH, NGAYVL, LUONGCOBAN, CHUCVU, GIOITINH FROM NHANVIEN ORDER BY MANV";

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
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getInt("MANV"));
                nv.setHoTen(rs.getString("HOTEN"));
                nv.setDiaChi(rs.getString("DIACHI"));
                nv.setSDT(rs.getString("SDT"));
                nv.setCMND(rs.getString("CMND"));
                nv.setNgSinh(rs.getDate("NGAYSINH").toLocalDate());
                nv.setNgVaoLam(rs.getDate("NGAYVL").toLocalDate());
                nv.setLuongCoBan(rs.getInt("LUONGCOBAN"));
                nv.setChucVu(rs.getString("CHUCVU"));
                nv.setGioiTinh(rs.getString("GIOITINH"));
                arr.add(nv);
            }
            
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }

    public static ArrayList<NhanVien> timNhanVien(String option, String value) {
        ArrayList<NhanVien> arr = new ArrayList<NhanVien>();
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            String SQL = null;
            switch (option) {
                case "Mã NV":
                    SQL = "SELECT MANV, HOTEN, DIACHI, SDT, CMND, NGAYSINH, NGAYVL, LUONGCOBAN, CHUCVU, GIOITINH FROM NHANVIEN WHERE MANV=?";
                    break;
                case "Họ tên":
                    SQL = "SELECT MANV, HOTEN, DIACHI, SDT, CMND, NGAYSINH, NGAYVL, LUONGCOBAN, CHUCVU, GIOITINH FROM NHANVIEN WHERE HOTEN=?";
                    break;
                case "SĐT":
                    SQL = "SELECT MANV, HOTEN, DIACHI, SDT, CMND, NGAYSINH, NGAYVL, LUONGCOBAN, CHUCVU, GIOITINH FROM NHANVIEN WHERE SDT=?";
                    break;
                case "CMND":
                    SQL = "SELECT MANV, HOTEN, DIACHI, SDT, CMND, NGAYSINH, NGAYVL, LUONGCOBAN, CHUCVU, GIOITINH FROM NHANVIEN WHERE CMND=?";
                    break;
            }

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien temp = new NhanVien();
                temp.setMaNV(rs.getInt("MANV"));
                temp.setHoTen(rs.getString("HOTEN"));
                temp.setDiaChi(rs.getString("DIACHI"));
                temp.setSDT(rs.getString("SDT"));
                temp.setCMND(rs.getString("CMND"));
                temp.setNgSinh(rs.getDate("NGAYSINH").toLocalDate());
                temp.setNgVaoLam(rs.getDate("NGAYVL").toLocalDate());
                temp.setLuongCoBan(rs.getInt("LUONGCOBAN"));
                temp.setChucVu(rs.getString("CHUCVU"));
                temp.setGioiTinh(rs.getString("GIOITINH"));

                arr.add(temp);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static String getChucVu(String value) {
        String chucVu = null;
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }

            String SQL = "SELECT CHUCVU FROM NHANVIEN\n"
                    + "WHERE MANV=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                chucVu = rs.getString("CHUCVU");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chucVu;
    }
    
    public static boolean Login(String username, String password) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "SELECT MANV, CMND FROM NHANVIEN\n"
                + "WHERE MANV=? and CMND=?";
        PreparedStatement ps = con.prepareStatement(SQL);
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return true;
        } else {
            return false;
        }
    }
}
