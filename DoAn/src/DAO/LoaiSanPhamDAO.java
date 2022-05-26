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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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

        return check > 0;
    }
    
    public static ArrayList<LoaiSanPham> getLoaiSanPhamAll() {
        ArrayList<LoaiSanPham> arr = new ArrayList<LoaiSanPham>();
        String SQL = "SELECT MALOAISP, TENLOAISP, GHICHU FROM LOAISANPHAM ORDER BY MALOAISP";

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
        String SQL = "SELECT MALOAISP FROM LOAISANPHAM ORDER BY MALOAISP";

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
