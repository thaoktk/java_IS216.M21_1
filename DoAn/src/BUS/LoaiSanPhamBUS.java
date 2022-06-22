/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoaiSanPhamDAO;
import DTO.LoaiSanPham;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class LoaiSanPhamBUS {
    public static boolean insertLSP(LoaiSanPham lsp) throws SQLException {
        return LoaiSanPhamDAO.insert(lsp);
    }
    
    public static ArrayList<LoaiSanPham> getLoaiSanPhamAll() {
        return LoaiSanPhamDAO.getLoaiSanPhamAll();
    }
    
    public static ArrayList<Integer> getMaLoaiSanPhamAll() {
        return LoaiSanPhamDAO.getMaLoaiSanPhamAll();
    }
    
    public static boolean update(LoaiSanPham lsp) throws SQLException {
        return LoaiSanPhamDAO.update(lsp);
    }
    
    public static boolean delete(String value) throws SQLException {
        return LoaiSanPhamDAO.delete(value);
    }
}
