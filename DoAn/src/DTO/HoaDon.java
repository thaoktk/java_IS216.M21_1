/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author asus
 */
public class HoaDon {
    private int soHD, maNV, maSP, maKM, soLuong;
    private Integer maKH;
    private LocalDate ngayHD;
    private double tongTien, triGia;
    private float chietKhau;
    private String ghiChu;
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public HoaDon(int soHD, int maNV, Integer maKH, int maSP, int maKM, int soLuong, LocalDate ngayHD, double tongTien, double triGia, float chietKhau, String ghiChu) {
        this.soHD = soHD;
        this.maNV = maNV;
        this.maKH = maKH;
        this.maKM = maKM;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.ngayHD = ngayHD;
        this.tongTien = tongTien;
        this.triGia = triGia;
        this.chietKhau = chietKhau;
        this.ghiChu = ghiChu;
    }

    public HoaDon() {
        this.soHD = 0;
        this.maNV = 0;
        this.maKH = null;
        this.maSP = 0;
        this.maKM = 0;
        this.soLuong = 0;
        this.ngayHD = null;
        this.tongTien = 0;
        this.triGia = 0;
        this.chietKhau = 0;
        this.ghiChu = "";
    }

    public int getSoHD() {
        return soHD;
    }

    public int getMaNV() {
        return maNV;
    }

    public Integer getMaKH() {
        return maKH;
    }

    public LocalDate getNgayHD() {
        return ngayHD;
    }

    public double getTongTien() {
        return tongTien;
    }

    public double getTriGia() {
        return triGia;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public int getMaSP() {
        return maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getMaKM() {
        return maKM;
    }

    public void setSoHD(int soHD) {
        this.soHD = soHD;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public void setMaKH(Integer maKH) {
        this.maKH = maKH;
    }

    public void setNgayHD(LocalDate ngayHD) {
        this.ngayHD = ngayHD;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setMaKM(int maKM) {
        this.maKM = maKM;
    }
    
    public String toString(LocalDate date) {
        return dateFormat.format(date);
    }
}
