/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.io.Serializable;

/**
 *
 * @author Hawin
 */
public class NhanVien implements Serializable{
    private String maNV;
    private String hoTen;
    private Integer tuoi;
    private String email;
    private Double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, Integer tuoi, String email, Double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", email=" + email + ", luong=" + luong + '}';
    }
   
    
}
