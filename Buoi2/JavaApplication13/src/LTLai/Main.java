/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTLai;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLNV qlnv = new QLNV();
        String check = "";
        while(true){
            qlnv.nhapTT();
            System.out.println("Co mun nhap tip khum");
            check = sc.nextLine();
            if (check.equals("no")) {
                break;
            }
        }
        ArrayList<NhanVien> list = qlnv.xuatTT();
        System.out.println("DS Nhan vien");
        for (NhanVien nhanVien : list) {
            System.out.println(nhanVien.toString());
        }
        System.out.println("Nhap phong ban can tim");
        String timPB = sc.nextLine();
        ArrayList<NhanVien> result = qlnv.search(timPB);
        if (result.isEmpty()) {
            System.out.println("Ko tim thay");
        }
        else{
            for (NhanVien nhanVien : result) {
                System.out.println(nhanVien.toString());
            }
        }
   qlnv.xoa();
    }
}
