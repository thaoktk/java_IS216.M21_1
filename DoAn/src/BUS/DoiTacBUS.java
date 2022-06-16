/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.DoiTacDAO;
import DTO.DoiTac;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class DoiTacBUS {
    public static ArrayList<DoiTac> getDoiTacAll() {
        return DoiTacDAO.getDoiTacAll();
    }
    
    public static boolean insertDT(DoiTac km) throws SQLException {
        return DoiTacDAO.insert(km);
    }
    
    public static boolean updateDT(DoiTac km) throws SQLException, ClassNotFoundException {
        return DoiTacDAO.update(km);
    }
    
    public static boolean deleteDT(String value) throws SQLException, ClassNotFoundException {
        return DoiTacDAO.delete(value);
    }
    
    public static ArrayList<DoiTac> timDoiTac(String option, String value) {
        return DoiTacDAO.timDoiTac(option, value);
    }
    
    public static ArrayList<String> getTenDT() {
        return DoiTacDAO.getTenDT();
    }
    
    public static int getMaDT(String value) {
        return DoiTacDAO.getMaDT(value);
    }
    
    public static String getTenDT(String value) {
        return DoiTacDAO.getTenDT(value);
    }
}
