/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.KhachHangDAO;
import DTO.KhachHang;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class KhachHangBUS {
    public static ArrayList<KhachHang> getKhachHangAll() {
        return KhachHangDAO.getKhachHangAll();
    }
    
    public static boolean insertKH(KhachHang kh) throws SQLException {
        return KhachHangDAO.insert(kh);
    }
    
    public static boolean updateKH(KhachHang kh) throws SQLException {
        return KhachHangDAO.update(kh);
    }
    
    public static boolean deleteKH(String maNV) throws SQLException, ClassNotFoundException {
        return KhachHangDAO.delete(maNV);
    }
    
    public static ArrayList<KhachHang> timKhachHang(String option, String value) {
        return KhachHangDAO.timKhachHang(option, value);
    }
    
    public static int getLoaiKH(String value) {
        return KhachHangDAO.getLoaiKH(value);
    }
    
    public static String getNgaySinh(String value) {
        return KhachHangDAO.getNgaySinh(value);
    }
    
    public static String getTenKH(String value) {
        return KhachHangDAO.getTenKH(value);
    }
}
