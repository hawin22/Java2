/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Hawin
 */
public class Main {
    public static void main(String[] args) {
        INhanVien nhanVien = new NhanVienImp();
        System.out.println(nhanVien.tinhTuoi());
        INhanVien nhanVien1 = new NhanVien2Impl();
        System.out.println(nhanVien1.tinhTuoi());
        
 
        // Nhan vien: ID, ten, GT (String), tuoi
        // sinh vien: ID, ten, lop, dia chi (String)
        QLNV qlnv = new QLNV();
        qlnv.setID("NV01");
        System.out.println(qlnv.getID());
        qlnv.setTen("Nguyen Ngoc");
        System.out.println(qlnv.getTen());
        qlnv.setGioiTinh("Nam");
        System.out.println(qlnv.getGioiTinh());
        QLNV qlnv1 = new QLNV();
        qlnv1.setTuoi(25);
        System.out.println(qlnv1.getTuoi());
    }
}
