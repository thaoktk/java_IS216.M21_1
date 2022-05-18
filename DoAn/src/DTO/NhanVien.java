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
public class NhanVien {
    private int maNV, luongCoBan;
    private String hoTen, gioiTinh, diaChi, SDT, CMND, chucVu;
    private LocalDate ngSinh, ngVaoLam;
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setNgSinh(LocalDate ngSinh) {
        this.ngSinh = ngSinh;
    }

    public void setNgVaoLam(LocalDate ngVaoLam) {
        this.ngVaoLam = ngVaoLam;
    }

    public NhanVien(int maNV, String hoTen, String gioiTinh, String diaChi, String SDT, String CMND, String chucVu, int luongCoBan, LocalDate ngSinh, LocalDate ngVaoLam) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.CMND = CMND;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.ngSinh = ngSinh;
        this.ngVaoLam = ngVaoLam;
    }

    public NhanVien() {
        this.maNV = 0;
        this.hoTen = "";
        this.gioiTinh = "";
        this.diaChi = "";
        this.SDT = "";
        this.CMND = "";
        this.chucVu = "";
        this.luongCoBan = 0;
        this.ngSinh = null;
        this.ngVaoLam = null;
    }

    public int getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public String getCMND() {
        return CMND;
    }

    public String getChucVu() {
        return chucVu;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public LocalDate getNgSinh() {
        return ngSinh;
    }

    public LocalDate getNgVaoLam() {
        return ngVaoLam;
    }
    
    public String toString(LocalDate date) {
        return dateFormat.format(date);
    }
    
}
