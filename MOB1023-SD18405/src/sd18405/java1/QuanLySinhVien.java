/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18405.java1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class QuanLySinhVien {

    Scanner sc = new Scanner(System.in);
    public ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    public void nhap() {
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Integer tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap lop: ");
        String lop = sc.nextLine();
        System.out.println("Nhap diem: ");
        Integer diem = Integer.parseInt(sc.nextLine());
        SinhVien sinhVien = new SinhVien(ma, hoTen, diaChi, tuoi, lop, diem);
        listSinhVien.add(sinhVien);

    }
    public ArrayList<SinhVien> xuatSinhVien(){
        return listSinhVien;
    }
    
    public ArrayList<SinhVien> timKiem(String tenCanTim){
        ArrayList<SinhVien> ketQuaTimKiem = new ArrayList<>();
        for(SinhVien sinhVien : listSinhVien){
            if(sinhVien.getHoTen().equals(tenCanTim)){
                ketQuaTimKiem.add(sinhVien);
            }
        }
        return ketQuaTimKiem;
    }

}
