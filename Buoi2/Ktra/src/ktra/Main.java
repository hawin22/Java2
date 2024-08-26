/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ktra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Tạo đối tượng NhanVien có cac thuộc tính sau: ID- Int, Ten - String, NamSinh
 * int, PhongBan, String 1đ LÀm menu sau 1. Nhập thông tin nhân viên. Nhập Y/N
 * để nhập tiếp hoặc không 3đ 2. In ra thông tin sau của nhân viên ID,Tên,Tuổi,
 * Phòng ban 2đ 3. Tìm kiếm nhân viên theo phòng ban 2đ 4. Xoá nhân viên theo ID
 * 2đ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLNV qlnv = new QLNV();
//        ArrayList<NhanVien> list = new ArrayList();
        String check = "";
        while (true) {
            qlnv.nhapTT();
            System.out.println("B co muon nhap tiep khong");
            check = sc.nextLine();
            if (check.equals("no")) {
                break;
            }
        }
        System.out.println("Danh sach nhan vien");
        ArrayList<NhanVien> xuat = qlnv.xuatTT();
        for (NhanVien nhanVien : xuat) {
            System.out.println(nhanVien.toString());
        }
        System.out.println("Nhap phong ban can tim");
        String searchPB = sc.nextLine();
        ArrayList<NhanVien> result = qlnv.search(searchPB);
        if (result.isEmpty()) {
            System.out.println("Ko tim thay phong ban");
        } else {
            for (NhanVien nhanVien : result) {
                System.out.println(nhanVien.toString());
            }
        }

        qlnv.xoa();
    }

}
