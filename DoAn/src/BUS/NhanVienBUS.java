/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVien;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class NhanVienBUS {
    public static ArrayList<NhanVien> getNhanVienAll() {
        return NhanVienDAO.getNhanVienAll();
    }
    
    public static boolean insertNV(NhanVien nv) throws SQLException {
        return NhanVienDAO.insert(nv);
    }
    
    public static boolean updateNV(NhanVien nv) throws SQLException {
        return NhanVienDAO.update(nv);
    }
    
    public static boolean deleteNV(String user) throws SQLException, ClassNotFoundException {
        return NhanVienDAO.delete(user);
    }
    
    public static ArrayList<NhanVien> timNhanVien(String option, String value) {
        return NhanVienDAO.timNhanVien(option, value);
    }
    
    public static String getChucVu(String value) {
        return NhanVienDAO.getChucVu(value);
    }
    
    public static boolean Login(String username, String password) throws SQLException {
        return NhanVienDAO.Login(username, password);
    }
    
    public static String getTenNV(String value) {
        return NhanVienDAO.getTenNV(value);
    }
}
