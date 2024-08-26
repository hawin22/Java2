/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ktra;

/**
 Tạo đối tượng NhanVien có cac thuộc tính sau: ID- Int, Ten - String, NamSinh int, PhongBan, String 1đ
LÀm menu sau
1. Nhập thông tin nhân viên. Nhập Y/N để nhập tiếp hoặc không 3đ
2. In ra thông tin sau của nhân viên ID,Tên,Tuổi, Phòng ban 2đ
3. Tìm kiếm nhân viên theo phòng ban 2đ 4. Xoá nhân viên theo ID
 * 2đ
 */
public class NhanVien {
    private int ID;
    private String Ten;
    private int NamSinh;
    private String PhongBan;

    public NhanVien(String ID1, String ten, String namSinh, String phongBan) {
    }

    public NhanVien(int ID, String Ten, int NamSinh, String PhongBan) {
        this.ID = ID;
        this.Ten = Ten;
        this.NamSinh = NamSinh;
        this.PhongBan = PhongBan;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(String PhongBan) {
        this.PhongBan = PhongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ID=" + ID + ", Ten=" + Ten + ", Tuoi = " +(2023 - NamSinh )+ ", PhongBan=" + PhongBan + '}';
    }
    
    
}
