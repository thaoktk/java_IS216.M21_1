/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.DoanhThuDAO;
import DTO.DoanhThu;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class DoanhThuBUS {
    public static ArrayList<Integer> getThangDoanhSo() {
        return DoanhThuDAO.getThangDoanhSo();
    }
    
    public static ArrayList<Integer> getNamDoanhSo() {
        return DoanhThuDAO.getNamDoanhSo();
    }
    
    public static ArrayList<Integer> getThangNhapHang() {
        return DoanhThuDAO.getThangNhapHang();
    }
    
    public static ArrayList<Integer> getNamNhapHang() {
        return DoanhThuDAO.getNamNhapHang();
    }
    public static double getDoanhSoTheoThang(DoanhThu dt) throws SQLException {
        return DoanhThuDAO.getDoanhSoTheoThang(dt);
    }
    
    public static double getDoanhThuTheoNam(DoanhThu dt) throws SQLException {
        return DoanhThuDAO.getDoanhThuTheoNam(dt);
    }
    
    public static double getTienNhapHangTheoThang(DoanhThu dt) throws SQLException {
        return DoanhThuDAO.getTienNhapHangTheoThang(dt);
    }
    
    public static double getTienNhapHangTheoNam(DoanhThu dt) throws SQLException {
        return DoanhThuDAO.getTienNhapHangTheoNam(dt);
    }
}
