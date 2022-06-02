/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDon;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class HoaDonBUS {
    public static ArrayList<HoaDon> getHoaDonAll() {
        return HoaDonDAO.getHoaDonAll();
    }
    
    public static boolean insertHD(HoaDon hd) throws SQLException, ClassNotFoundException {
        return HoaDonDAO.insert(hd);
    }
    
    public static int getSoHD() {
        return HoaDonDAO.getSoHD();
    }
    
    public static boolean insertCTHD(HoaDon hd) throws SQLException, ClassNotFoundException {
        return HoaDonDAO.insertCTHD(hd);
    }
    
    public static boolean insertCTKM(HoaDon hd) throws SQLException {
        return HoaDonDAO.insertCTKM(hd);
    }
    
    public static ArrayList<HoaDon> timHoaDon(String option, String value) {
        return HoaDonDAO.timHoaDon(option, value);
    }
    
    public static HoaDon getChiTietHoaDon(int value) {
        return HoaDonDAO.getChiTietHoaDon(value);
    }
}
