/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.LoaiSanPham;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;
import java.sql.PreparedStatement;

/**
 *
 * @author asus
 */
public class LoaiSanPhamDAO {
    public static boolean insert(LoaiSanPham lsp) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String SQL = "{? = call INSERT_LOAISANPHAM(?, ?)}";

        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.INTEGER);
        ps.setString(2, lsp.getTenLoaiSP());
        ps.setString(3, lsp.getGhiChu());
        ps.executeUpdate();
        int check = ps.getInt(1);
        con.close();

        return check > 0;
    }
    
    public static boolean update(LoaiSanPham lsp) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        String SQL = "UPDATE LOAISANPHAM SET TENLOAISP = ?, GHICHU = ? WHERE MALOAISP = ?";
        PreparedStatement ps = con.prepareStatement(SQL);
        ps.setString(1, lsp.getTenLoaiSP());
        ps.setString(2, lsp.getGhiChu());
        ps.setInt(3, lsp.getMaLoaiSP());
        return ps.executeUpdate() > 0;
    }
    
    public static boolean delete(String value) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        CallableStatement ps = null;
        try {
            String SQL = "{? = call DELETE_LOAISANPHAM(?)}";
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
    
    public static ArrayList<LoaiSanPham> getLoaiSanPhamAll() {
        ArrayList<LoaiSanPham> arr = new ArrayList<LoaiSanPham>();
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
                LoaiSanPham sp = new LoaiSanPham();
                sp.setMaLoaiSP(rs.getInt("MALOAISP"));
                sp.setTenLoaiSP(rs.getString("TENLOAISP"));
                sp.setGhiChu(rs.getString("GHICHU"));
                arr.add(sp);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    public static ArrayList<Integer> getMaLoaiSanPhamAll() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
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
                int maSP = rs.getInt("MALOAISP");
                arr.add(maSP);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
}
