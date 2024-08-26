/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN;

/**
 *
 * @author Hawin
 */
public class DongVat {
    private String Ma;
    private String Ten;
    private String Loai;
    private String GioiTinh;

    public DongVat() {
    }

    public DongVat(String Ma, String Ten, String Loai, String GioiTinh) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Loai = Loai;
        this.GioiTinh = GioiTinh;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    @Override
    public String toString() {
        return "DongVat{" + "Ma=" + Ma + ", Ten=" + Ten + ", Loai=" + Loai + ", GioiTinh=" + GioiTinh + '}';
    }
    
    
    
}
