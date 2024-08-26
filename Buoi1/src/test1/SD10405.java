/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class SD10405 {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        Scanner sc = new Scanner(System.in);
        String check = "";
        while(true){
            qlsv.nhap();
            System.out.println("B co muon nhap tiep ko");
            check = sc. nextLine();
            if(check.equals("no")){
                break;
            }
        }
    ArrayList<Test1> list = qlsv.xuatSinhVien();
    //  list.forEach(x -> System.out.println(x.toString()));
        System.out.println("Danh sach sinh vien: \n");
        
        for (Test1 sinhVien : list) {
            System.out.println(sinhVien.toString());
        }
        System.out.println("Nhap ten can tim: ");
        String tenCanTim = sc.nextLine();
//        for (Test1 sinhVien : list) {
//            if (tenCanTim.equals(sinhVien.getHoTen())) {
//                System.out.println("Thong tin sinh vien can tim: ");
//                System.out.println(sinhVien.toString());
//            }
//        }
    ArrayList<Test1> ketQuaTimKiem = qlsv.timKiem(tenCanTim);
        if (ketQuaTimKiem.isEmpty()) {
            System.out.println("Ko tim thay kq");
        } 
        else{
            for (Test1 sinhVien : ketQuaTimKiem) {
                System.out.println(sinhVien.toString());
            }
        }
        
        
        
        ArrayList<Test1> result = qlsv.searchDiem();
        if (result.isEmpty()) {
            System.out.println("Ko tim thay kq");
        }
        else{
            for (Test1 diem : result) {
                System.out.println(diem.toString());
            }
        }
        
        
        
    }
}
