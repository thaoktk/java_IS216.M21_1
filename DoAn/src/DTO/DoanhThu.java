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
    private int thang, nam, maSP;
    private double gia, tongTien;
    private String tenSP;

    public DoanhThu(int thang, int nam, int maSP, double gia, double tongTien, String tenSP) {
        this.thang = thang;
        this.nam = nam;
        this.maSP = maSP;
        this.gia = gia;
        this.tongTien = tongTien;
        this.tenSP = tenSP;
    }

    public DoanhThu() {
        this.thang = 0;
        this.nam = 0;
        this.maSP = 0;
        this.gia = 0;
        this.tongTien = 0;
        this.tenSP = "";
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public int getMaSP() {
        return maSP;
    }

    public double getGia() {
        return gia;
    }

    public double getTongTien() {
        return tongTien;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    
    
}
