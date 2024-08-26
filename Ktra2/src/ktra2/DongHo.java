/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ktra2;

/**
 *
 * @author Hawin
 */
public class DongHo {
    
    private String tenKhachHang;
    private String loaiVe;
    private Integer soLuong;
   
    public DongHo() {
    }

    public DongHo(String tenKhachHang, String loaiVe, Integer soLuong) {
        this.tenKhachHang = tenKhachHang;
        this.loaiVe = loaiVe;
        this.soLuong = soLuong;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

   
    @Override
    public String toString() {
        return "DongHo{" + "tenKhachHang=" + tenKhachHang + ", loaiVe=" + loaiVe + ", soLuong=" + soLuong +'}';
    }
    
    
}
