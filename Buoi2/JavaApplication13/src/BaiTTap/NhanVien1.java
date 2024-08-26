/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTTap;

/**
 *
 * @author Hawin
 */
public class NhanVien1 {
    private String tenDN;
    private String gioiTinh;
    private String lop;

    public NhanVien1() {
    }

    public NhanVien1(String tenDN, String gioiTinh, String lop) {
        this.tenDN = tenDN;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "QLNVView{" + "tenDN=" + tenDN + ", gioiTinh=" + gioiTinh + ", lop=" + lop + '}';
    }
    
    
}
