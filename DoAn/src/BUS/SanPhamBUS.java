/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.SanPhamDAO;
import DTO.SanPham;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class SanPhamBUS {

    public static boolean insertSP(SanPham sp) throws SQLException {
        return SanPhamDAO.insert(sp);
    }

    public static boolean updateSP(SanPham sp) throws SQLException {
        return SanPhamDAO.update(sp);
    }

    public static boolean deleteSP(String value) throws SQLException{
        return SanPhamDAO.delete(value);
    }
    
    public static ArrayList<SanPham> getSanPhamAll() {
        return SanPhamDAO.getSanPhamAll();
    }
    
    public static SanPham getChiTietSanPham(int value) {
        return SanPhamDAO.getChiTietSanPham(value);
    }
    
    public static ArrayList<SanPham> timSanPham(String option, String value) {
        return SanPhamDAO.timSanPham(option, value);
    }
    
    public static String getAnhSP(int value) {
        return SanPhamDAO.getAnhSP(value);
    }
    public static ArrayList<String> getTenLSP() {
        return SanPhamDAO.getTenLSP();
    }
    
    public static int getMaLSP(String value) {
        return SanPhamDAO.getMaLSP(value);
    }
    
    public static String getTenLSP(int value) {
        return SanPhamDAO.getTenLSP(value);
    }
    
    public static int getMaSP(String value) {
        return SanPhamDAO.getMaSP(value);
    }
    
    public static ArrayList<String> getTenSP() {
        return SanPhamDAO.getTenSP();
    }
    public static int getSoLuong(String value) {
        return SanPhamDAO.getSoLuong(value);
    }
    
    public static ArrayList<SanPham> getSanPhamHoaDon(String value) {
        return SanPhamDAO.getSanPhamHoaDon(value);
    }
    
    public static String getTenSP(int value) {
        return SanPhamDAO.getTenSP(value);
    }
}
