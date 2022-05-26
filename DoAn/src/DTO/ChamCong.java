/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author asus
 */
public class ChamCong {
    private int maNV;
    private double soGioLamThem;
    private LocalDateTime checkIn, checkOut;
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public ChamCong(int maNV, double soGioLamThem, LocalDateTime checkIn, LocalDateTime checkOut) {
        this.maNV = maNV;
        this.soGioLamThem = soGioLamThem;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public ChamCong() {
        this.maNV = 0;
        this.soGioLamThem = 0;
        this.checkIn = null;
        this.checkOut = null;
    }

    public int getMaNV() {
        return maNV;
    }

    public double getSoGioLamThem() {
        return soGioLamThem;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public void setSoGioLamThem(double soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }
    
    public String toString(LocalDateTime date) {
        if (date != null) {
            return date.format(dateFormat);
        }
        return "";
    }
}
