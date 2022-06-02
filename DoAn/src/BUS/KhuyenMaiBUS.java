/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.KhuyenMaiDAO;
import DTO.KhuyenMai;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class KhuyenMaiBUS {
    public static ArrayList<KhuyenMai> getKhuyenMaiAll() {
        return KhuyenMaiDAO.getKhuyenMaiAll();
    }
    
    public static boolean insertKM(KhuyenMai km) throws SQLException {
        return KhuyenMaiDAO.insert(km);
    }
    
    public static boolean updateKM(KhuyenMai km) throws SQLException {
        return KhuyenMaiDAO.update(km);
    }
    
    public static boolean deleteKM(String value) throws SQLException, ClassNotFoundException {
        return KhuyenMaiDAO.delete(value);
    }
    
    public static ArrayList<KhuyenMai> timKhuyenMai(String option, String value) {
        return KhuyenMaiDAO.timKhuyenMai(option, value);
    }
    
    public static ArrayList<KhuyenMai> getKhuyenMaiHopLeAll() {
        return KhuyenMaiDAO.getKhuyenMaiHopLeAll();
    }
    
    public static ArrayList<KhuyenMai> getKhuyenMaiHoaDon(String value) {
        return KhuyenMaiDAO.getKhuyenMaiHoaDon(value);
    }
}
