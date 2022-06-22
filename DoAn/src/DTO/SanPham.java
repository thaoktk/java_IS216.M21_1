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
public class SanPham {
    private int maSP, maLoaiSP, slsan;
    private String tenSP, mauSac, ghiChu, anhSP, tenLSP;
    private long giaSP;
//    private byte[] hinh;

    public SanPham(int maSP, int maLoaiSP, int slsan, String tenSP, String mauSac, String ghiChu, String anhSP, long giaSP, String tenLSP) {
        this.maSP = maSP;
        this.maLoaiSP = maLoaiSP;
        this.slsan = slsan;
        this.tenSP = tenSP;
        this.mauSac = mauSac;
        this.ghiChu = ghiChu;
        this.anhSP = anhSP;
        this.giaSP = giaSP;
        this.tenLSP = tenLSP;
    }


    public SanPham() {
        this.maSP = 0;
        this.maLoaiSP = 0;
        this.slsan = 0;
        this.tenSP = "";
        this.mauSac = "";
        this.ghiChu = "";
        this.anhSP = "";
        this.giaSP = 0;
        this.tenLSP = "";
    }

    public String getAnhSP() {
        return anhSP;
    }

    public int getMaSP() {
        return maSP;
    }

    public String getTenLSP() {
        return tenLSP;
    }

    public int getMaLoaiSP() {
        return maLoaiSP;
    }

    public int getSlsan() {
        return slsan;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getMauSac() {
        return mauSac;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public long getGiaSP() {
        return giaSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public void setMaLoaiSP(int maLoaiSP) {
        this.maLoaiSP = maLoaiSP;
    }

    public void setSlsan(int slsan) {
        this.slsan = slsan;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setTenLSP(String tenLSP) {
        this.tenLSP = tenLSP;
    }

    public void setGiaSP(long giaSP) {
        this.giaSP = giaSP;
    }

    public void setAnhSP(String anhSP) {
        this.anhSP = anhSP;
    }
    
    
}
