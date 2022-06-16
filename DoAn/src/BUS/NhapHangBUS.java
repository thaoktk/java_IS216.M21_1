/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhapHangDAO;
import DTO.NhapHang;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class NhapHangBUS {
    public static ArrayList<NhapHang> getNhapHangAll() {
        return NhapHangDAO.getNhapHangAll();
    }
    
    public static ArrayList<NhapHang> timNhapHang(String option, String value) {
        return NhapHangDAO.timNhapHang(option, value);
    }
    
    
    public static boolean insertNH(NhapHang nh) throws SQLException {
        return NhapHangDAO.insert(nh);
    }
    
    public static boolean insertCTPN(NhapHang nh) throws SQLException {
        return NhapHangDAO.insertCTPN(nh);
    }
    
    public static int getMaPN() {
        return NhapHangDAO.getMaPN();
    }
    
    public static ArrayList<NhapHang> getSanPhamNhapHang(String value) {
        return NhapHangDAO.getSanPhamNhapHang(value);
    }
    
    public static ArrayList<NhapHang> getSPNhapHangAll(String value) {
        return NhapHangDAO.getSPNhapHangAll(value);
    }
}
