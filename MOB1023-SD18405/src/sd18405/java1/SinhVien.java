/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18405.java1;

/**
 *
 * @author nguyenvv
 */
public class SinhVien {
    
    private String maSinhVien;
    private String hoTen;
    private String diaChi;
    private Integer tuoi;
    private String lop;
    private Integer diem;

    public SinhVien(String maSinhVien, String hoTen, String diaChi, Integer tuoi, String lop, Integer diem) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.lop = lop;
        this.diem = diem;
    }

    public SinhVien() {
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
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
        return "SinhVien{" + "maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", tuoi=" + tuoi + ", lop=" + lop + ", diem=" + diem + '}';
    }
    
    
}
