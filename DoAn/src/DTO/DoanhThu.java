/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author asus
 */
public class DoanhThu {
    private int thang, nam;
    private double tongTien;

    public DoanhThu(int thang, int nam,double tongTien) {
        this.thang = thang;
        this.nam = nam;
        this.tongTien = tongTien;
    }

    public DoanhThu() {
        this.thang = 0;
        this.nam = 0;
        this.tongTien = 0;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
