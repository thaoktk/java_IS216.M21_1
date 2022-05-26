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
public class KhachHang {
    private int MaKH, tichLuy;
    private String hoTen, gioiTinh, diaChi, SDT, loaiKH, ghiChu;
    private LocalDate ngSinh, ngDK;
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public KhachHang() {
        this.MaKH = 0;
        this.tichLuy = 0;
        this.hoTen = "";
        this.gioiTinh = "";
        this.diaChi = "";
        this.SDT = "";
        this.loaiKH = "";
        this.ghiChu = "";
        this.ngSinh = null;
        this.ngDK = null;
    }

    public KhachHang(int MaKH, int tichLuy, String hoTen, String gioiTinh, String diaChi, String SDT, String loaiKH, String ghiChu, LocalDate ngSinh, LocalDate ngDK) {
        this.MaKH = MaKH;
        this.tichLuy = tichLuy;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.loaiKH = loaiKH;
        this.ghiChu = ghiChu;
        this.ngSinh = ngSinh;
        this.ngDK = ngDK;
    }

    public int getMaKH() {
        return MaKH;
    }

    public int getTichLuy() {
        return tichLuy;
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

    public String getLoaiKH() {
        return loaiKH;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public LocalDate getNgSinh() {
        return ngSinh;
    }

    public LocalDate getNgDK() {
        return ngDK;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public void setTichLuy(int tichLuy) {
        this.tichLuy = tichLuy;
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

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setNgSinh(LocalDate ngSinh) {
        this.ngSinh = ngSinh;
    }

    public void setNgDK(LocalDate ngDK) {
        this.ngDK = ngDK;
    }
    
    public String toString(LocalDate date) {
        return dateFormat.format(date);
    }
}
