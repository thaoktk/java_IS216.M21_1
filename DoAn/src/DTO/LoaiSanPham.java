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
public class LoaiSanPham {
    private int maLoaiSP;
    private String tenLoaiSP, ghiChu;

    public LoaiSanPham(int maLoaiSP, String tenLoaiSP, String ghiChu) {
        this.maLoaiSP = maLoaiSP;
        this.tenLoaiSP = tenLoaiSP;
        this.ghiChu = ghiChu;
    }

    public LoaiSanPham() {
        this.maLoaiSP = 0;
        this.tenLoaiSP = "";
        this.ghiChu = "";
    }

    public int getMaLoaiSP() {
        return maLoaiSP;
    }

    public String getTenLoaiSP() {
        return tenLoaiSP;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setMaLoaiSP(int maLoaiSP) {
        this.maLoaiSP = maLoaiSP;
    }

    public void setTenLoaiSP(String tenLoaiSP) {
        this.tenLoaiSP = tenLoaiSP;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
