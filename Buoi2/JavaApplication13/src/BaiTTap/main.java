/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTTap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class main {
    public static void main(String[] args) {
        QLNV qlnv = new QLNV();
        Scanner sc = new Scanner(System.in);
        String check = "";
        while(true) {
            qlnv.nhap();
            System.out.println("Ban co muon nhap tip ko ???");
            check = sc.nextLine();
            if(check.equals("no")){
                break;
            }
        }
        ArrayList<NhanVien> list = qlnv.xuatNhanVien();
        System.out.println("Danh sach sinh vien");
        for (NhanVien nhanVien : list) {
            System.out.println(nhanVien.toString());
        }
        
        System.out.println("Nhap phong ban can tim: ");
        String searchPB = sc.nextLine();
        ArrayList<NhanVien> result = qlnv.search(searchPB);
        if (result.isEmpty()) {
            System.out.println("ko tim thay");
        }
        else{
            for (NhanVien nhanVien : result) {
                System.out.println(nhanVien.toString());
            }
        }
        System.out.println("Danh sach: ");
        qlnv.addNamSinh();
     
    }
}
