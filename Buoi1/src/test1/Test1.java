/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

/**
 *
 * @author Hawin
 */
public class Test1 {
    private String maSinhVien;
    private String hoTen;
    private Integer tuoi;
    private String diaChi;
    private String lop;
    private Integer diem;

    public Test1(String maSinhVien, String hoTen, Integer tuoi, String diaChi, String lop, Integer diem) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.lop = lop;
        this.diem = diem;
    }

    public Test1() {
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Test1{" + "maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", diaChi=" + diaChi + ", lop=" + lop + ", diem=" + diem + '}';
    }

    
}