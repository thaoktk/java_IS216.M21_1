/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LuongDAO;
import DTO.Luong;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class LuongBUS {
    public static ArrayList<Luong> getLuongAll() {
        return LuongDAO.getLuongAll();
    }
    
    public static ArrayList<Integer> getMaNV(){
        return LuongDAO.getMaNV();
    }
    
    public static boolean tinhLuong(Luong luong) throws SQLException, ClassNotFoundException {
        return LuongDAO.tinhLuong(luong);
    }
    
    public static ArrayList<Luong> timLuong(String option, String value) {
        return LuongDAO.timLuong(option, value);
    }
    public static int getThangLuong() {
        return LuongDAO.getThangLuong();
    }
    
    public static boolean deleteLuong() throws SQLException, ClassNotFoundException {
        return LuongDAO.deleteLuong();
    }
}
