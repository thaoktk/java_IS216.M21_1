/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionUtils;
import DTO.HoaDon;
import DTO.NhanVien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class HoaDonDAO {
    public static ArrayList<HoaDon> getHoaDonAll() {
        ArrayList<HoaDon> arr = new ArrayList<HoaDon>();
        String SQL = "SELECT SOHD, MANV,MAKH,NGAYHD,TONGTIEN,CHIETKHAU,TRIGIAHD FROM HOADON ORDER BY SOHD";
        try {
            Connection con = null;
            try {
                con = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaNV(rs.getInt("MANV"));
                hd.setSoHD(rs.getInt("SOHD"));
                hd.setMaKH(rs.getInt("MAKH"));
                hd.setChietKhau(rs.getFloat("CHIETKHAU"));
                hd.setTongTien(rs.getDouble("TONGTIEN"));
                hd.setTriGia(rs.getDouble("TRIGIAHD"));
                hd.setNgayHD(rs.getDate("NGAYHD").toLocalDate());
                arr.add(hd);
            }
            
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return arr;
    }
}
