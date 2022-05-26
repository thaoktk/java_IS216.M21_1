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
public class DoiTac {
    private int maDT;
    private String tenDT, diaChi, SDT;

    public DoiTac(int maDT, String tenDT, String diaChi, String SDT) {
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }

    public DoiTac() {
        this.maDT = 0;
        this.tenDT = "";
        this.diaChi = "";
        this.SDT = "";
    }

    public int getMaDT() {
        return maDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setMaDT(int maDT) {
        this.maDT = maDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
    
}
