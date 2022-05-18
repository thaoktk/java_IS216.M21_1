/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDon;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class HoaDonBUS {
    public static ArrayList<HoaDon> getHoaDonAll() {
        return HoaDonDAO.getHoaDonAll();
    }
}
