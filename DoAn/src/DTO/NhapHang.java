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
public class NhapHang {
    private int maPN, maNV, maSP, maNCC, slNhap;
    private LocalDate ngayNhap;
    private double tongTienNhap, giaNhap;
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public NhapHang() {
        this.maPN = 0;
        this.maNV = 0;
        this.maSP = 0;
        this.slNhap = 0;
        this.ngayNhap = null;
        this.tongTienNhap = 0;
        this.giaNhap = 0;
    }

    public NhapHang(int maPN, int maNV, int maSP, int maNCC, int slNhap, LocalDate ngayNhap, double tongTienNhap, double giaNhap) {
        this.maPN = maPN;
        this.maNV = maNV;
        this.maSP = maSP;
        this.maNCC = maNCC;
        this.slNhap = slNhap;
        this.ngayNhap = ngayNhap;
        this.tongTienNhap = tongTienNhap;
        this.giaNhap = giaNhap;
    }

    public int getMaNCC() {
        return maNCC;
    }

    public int getMaPN() {
        return maPN;
    }

    public int getMaNV() {
        return maNV;
    }

    public int getMaSP() {
        return maSP;
    }

    public int getSlNhap() {
        return slNhap;
    }

    public long getGiaNhap() {
        return (long) giaNhap;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public long getTongTienNhap() {
        return (long) tongTienNhap;
    }

    public void setMaPN(int maPN) {
        this.maPN = maPN;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setTongTienNhap(double tongTienNhap) {
        this.tongTienNhap = tongTienNhap;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }
    
    public String toString(LocalDate date) {
        return dateFormat.format(date);
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }
}
