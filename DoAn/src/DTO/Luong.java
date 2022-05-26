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
public class Luong {
    private int thang, nam, maNV;
    private double luong, soGioLamTC, soGioLamTT;

    public Luong(int thang, int nam, int maNV, double soGioLamTC, double soGioLamTT, double luong) {
        this.thang = thang;
        this.nam = nam;
        this.maNV = maNV;
        this.soGioLamTC = soGioLamTC;
        this.soGioLamTT = soGioLamTT;
        this.luong = luong;
    }

    public Luong() {
        this.thang = 0;
        this.nam = 0;
        this.maNV = 0;
        this.soGioLamTC = 0;
        this.soGioLamTT = 0;
        this.luong = 0;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public int getMaNV() {
        return maNV;
    }

    public double getSoGioLamTC() {
        return soGioLamTC;
    }

    public double getSoGioLamTT() {
        return soGioLamTT;
    }

    public double getLuong() {
        return luong;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public void setSoGioLamTC(double soGioLamTC) {
        this.soGioLamTC = soGioLamTC;
    }

    public void setSoGioLamTT(double soGioLamTT) {
        this.soGioLamTT = soGioLamTT;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    
}
