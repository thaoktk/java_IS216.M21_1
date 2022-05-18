/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author asus
 */
public class KhuyenMai {
    private int maKM;
    private String tenKM;
    private float phanTram;
    private LocalDateTime ngBD, ngKT;
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public KhuyenMai(int maKM, String tenKM, float phanTram, LocalDateTime ngBD, LocalDateTime ngKT) {
        this.maKM = maKM;
        this.tenKM = tenKM;
        this.phanTram = phanTram;
        this.ngBD = ngBD;
        this.ngKT = ngKT;
    }

    public KhuyenMai() {
        this.maKM = 0;
        this.tenKM = "";
        this.phanTram = 0;
        this.ngBD = null;
        this.ngKT = null;
    }

    public int getMaKM() {
        return maKM;
    }

    public String getTenKM() {
        return tenKM;
    }

    public float getPhanTram() {
        return phanTram;
    }

    public LocalDateTime getNgBD() {
        return ngBD;
    }

    public LocalDateTime getNgKT() {
        return ngKT;
    }

    public void setMaKM(int maKM) {
        this.maKM = maKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public void setPhanTram(float phanTram) {
        this.phanTram = phanTram;
    }

    public void setNgBD(LocalDateTime ngBD) {
        this.ngBD = ngBD;
    }

    public void setNgKT(LocalDateTime ngKT) {
        this.ngKT = ngKT;
    }
    
    public String toString(LocalDateTime date) {
        if (date != null) {
            return date.format(dateFormat);
        }
        return "";
    }
}
