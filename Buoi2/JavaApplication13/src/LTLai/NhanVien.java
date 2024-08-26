/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTLai;

/**
 * * Tạo class NhanVien: maNhanVien: String, tenNhanVien: String, luongCoBan: Int, phongBan: String, chucVu: String, namSinh Int, gioiTinh Bool
- Nhập danh sách nhân viên
- Hiển thị thông tin danh sách
- Tìm kiếm nhân viên theo phòng ban
- hiển thị thông tin nhân viên kèm tuổi =2023 - năm sinh
 * 
 * @author Hawin
 */
public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private int luongCoBan;
    private String phongBan;
    private String chucVu;
    private int namSinh;
    private boolean gioiTinh;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, int luongCoBan, String phongBan, String chucVu, int namSinh, boolean gioiTinh) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.phongBan = phongBan;
        this.chucVu = chucVu;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

      public String checkGioiTinh(boolean gioiTinh) {
        if (gioiTinh) {
            return "Nam";
        } else {
            return "Nu";
        }

    }
    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
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

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", luongCoBan=" + luongCoBan + ", phongBan=" + phongBan + ", chucVu=" + chucVu + ", namSinh=" + namSinh + ", gioiTinh=" + checkGioiTinh(gioiTinh) + ", tuoi="+(2023-namSinh)+ '}';
    }
    
    
    
}
