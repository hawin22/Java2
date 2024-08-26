/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BaiTTap;

/**
 *
 * @author Hawin
 */
public class NhanVien {
     private String maNV;
     private String tenNV;
     private int luongCB;
     private String phongBan;
     private String chucVu;
     private int tuoi;
     private boolean gioiTinh;

    public NhanVien(int namSinh) {
    }

    public NhanVien(String maNV, String tenNV, int luongCB, String phongBan, String chucVu, int tuoi, boolean gioiTinh) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;
        this.phongBan = phongBan;
        this.chucVu = chucVu;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", luongCB=" + luongCB + ", phongBan=" + phongBan + ", chucVu=" + chucVu + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + '}';
    }
   
}

