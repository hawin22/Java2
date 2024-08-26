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
public class QLSV {

    Scanner sc = new Scanner(System.in);
    public ArrayList<Test1> listSinhVien = new ArrayList<>();

    public void nhap() {
        System.out.println("Nhap ma:");
        String ma = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Integer tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhap lop: ");
        String lop = sc.nextLine();
        System.out.println("Nhap diem: ");
        Integer diem = Integer.parseInt(sc.nextLine());
        Test1 SinhVien = new Test1(ma, ten, tuoi, diaChi, lop, diem);
        listSinhVien.add(SinhVien);
    }

    public ArrayList<Test1> xuatSinhVien() {
        return listSinhVien;
    }

    public ArrayList<Test1> timKiem(String tenCanTim) {
        ArrayList<Test1> ketQuaTimKiem = new ArrayList<>();
        for (Test1 sinhVien : listSinhVien) {
            if (sinhVien.getHoTen().equals(tenCanTim)) {
                ketQuaTimKiem.add(sinhVien);
            }
        }
        return ketQuaTimKiem;
    }
    public ArrayList<Test1> searchDiem(){
        ArrayList<Test1> result = new ArrayList<>();
        for (Test1 diem : listSinhVien) {
            if (diem.getDiem()>5) {
                result.add(diem);
            }
        }
        return result;
    }

}
