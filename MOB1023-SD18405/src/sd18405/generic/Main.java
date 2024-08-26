/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18405.generic;

/**
 *
 * @author nguyenvv
 */
public class Main {

    public static void main(String[] args) {
        INhanVien nhanVien = new NhanVienImpl();
        System.out.println(nhanVien.tinhTuoi());
        INhanVien nhanVien2 = new NhanVien2Impl();
        System.out.println(nhanVien2.tinhTuoi());
        
        QuanLySinhVien<String> quanLySinhVien = new QuanLySinhVien<>();
        quanLySinhVien.setT("xin chao");
//        quanLySinhVien.setT(1);
        System.out.println(quanLySinhVien.getT());
        
        QuanLySinhVien<Integer> quanLySinhVien1 = new QuanLySinhVien<>();
        quanLySinhVien1.setT(1);
        
        // Nhan vien: ID, ma, ten, GT (String)
        // sinh vien: ID, ten, lop, dia chi (String)
    }
    
}
