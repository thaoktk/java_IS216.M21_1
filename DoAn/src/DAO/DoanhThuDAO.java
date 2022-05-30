/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.DoanhThu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class DoanhThuDAO {
    public static ArrayList<Integer> getThangDoanhSo() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String SQL = "SELECT DISTINCT(EXTRACT( MONTH FROM NGAYHD )) AS MONTH FROM HOADON";
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
                int thang = rs.getInt("MONTH");
                arr.add(thang);
            }
            
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static ArrayList<Integer> getNamDoanhSo() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String SQL = "SELECT DISTINCT(EXTRACT( YEAR FROM NGAYHD )) AS YEAR FROM HOADON";
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
                int nam = rs.getInt("YEAR");
                arr.add(nam);
            }
            
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static ArrayList<Integer> getThangNhapHang() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String SQL = "SELECT DISTINCT(EXTRACT( MONTH FROM NGAYNHAP )) AS MONTH FROM PHIEUNHAP";
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
                int thang = rs.getInt("MONTH");
                arr.add(thang);
            }
            
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static ArrayList<Integer> getNamNhapHang() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String SQL = "SELECT DISTINCT(EXTRACT( YEAR FROM NGAYNHAP )) AS YEAR FROM PHIEUNHAP";
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
                int nam = rs.getInt("YEAR");
                arr.add(nam);
            }
            
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return arr;
    }
    
    public static double getDoanhSoTheoThang(DoanhThu dt) throws SQLException {
        double doanhSo = 0;
        String SQL = "{? = call ThongKeDoanhThuThang(?, ?)}";
        
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.DOUBLE);
        ps.setInt(2, dt.getThang());
        ps.setInt(3, dt.getNam());
        ps.executeUpdate();
        
        doanhSo = ps.getDouble(1);
        con.close();
        
        return doanhSo;
    }
    
    public static double getDoanhThuTheoNam(DoanhThu dt) throws SQLException {
        double doanhSo = 0;
        String SQL = "{? = call ThongKeDoanhThuNam(?)}";
        
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.DOUBLE);
        ps.setInt(2, dt.getNam());
        ps.executeUpdate();
        
        doanhSo = ps.getDouble(1);
        con.close();
        
        return doanhSo;
    }
    
    public static double getTienNhapHangTheoThang(DoanhThu dt) throws SQLException {
        double tienNhap = 0;
        String SQL = "{? = call ThongKeTienNhapThang(?, ?)}";
        
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.DOUBLE);
        ps.setInt(2, dt.getThang());
        ps.setInt(3, dt.getNam());
        ps.executeUpdate();
        
        tienNhap = ps.getDouble(1);
        con.close();
        
        return tienNhap;
    }
    
    public static double getTienNhapHangTheoNam(DoanhThu dt) throws SQLException {
        double tienNhap = 0;
        String SQL = "{? = call ThongKeTienNhapNam(?)}";
        
        Connection con = null;
        try {
            con = ConnectionUtils.getMyConnection();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        CallableStatement ps = con.prepareCall(SQL);
        ps.registerOutParameter(1, java.sql.Types.DOUBLE);
        ps.setInt(2, dt.getNam());
        ps.executeUpdate();
        
        tienNhap = ps.getDouble(1);
        con.close();
        
        return tienNhap;
    }
}
