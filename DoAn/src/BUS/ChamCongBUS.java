/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChamCongDAO;
import DTO.ChamCong;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class ChamCongBUS {
    public static boolean insertCC(int value) throws SQLException, ClassNotFoundException {
        return ChamCongDAO.insert(value);
    }
    
    public static boolean updateCC(int value) throws SQLException, ClassNotFoundException {
        return ChamCongDAO.update(value);
    }
    
    public static ArrayList<ChamCong> getChamCongAll() {
        return ChamCongDAO.getChamCongAll();
    }
    
    public static String getCheckIn(String user) {
        return ChamCongDAO.getCheckIn(user);
    }
    
    public static String getCheckOut(String user) {
        return ChamCongDAO.getCheckOut(user);
    }
    
    public static ArrayList<ChamCong> timChamCong(String option, String value) {
        return ChamCongDAO.timChamCong(option, value);
    }
}
