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
public class QLNV {
    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> listNhanVien = new ArrayList<>();

   public void nhapTT(){
       System.out.println("Nhap ma nhan vien: ");
       String ma = sc.nextLine();
       System.out.println("Nhap ten nhan vien: ");
       String ten = sc.nextLine();
       System.out.println("Nhap luong: ");
       Integer luong = Integer.parseInt(sc.nextLine());
       System.out.println("Nhap phong ban:");
       String phongBan = sc.nextLine();
       System.out.println("Nhap chuc vu: ");
       String chucVu = sc.nextLine();
       System.out.println("Nhap nam sinh: ");
       Integer namSinh = Integer.parseInt(sc.nextLine());
       System.out.println("Nhap gioi tinh: ");
       Boolean gioiTinh = Boolean.parseBoolean(sc.nextLine());
       NhanVien nhanVien = new NhanVien(ma, ten, luong, phongBan, chucVu, namSinh, gioiTinh);
       listNhanVien.add(nhanVien);
   }
    public ArrayList<NhanVien> xuatTT(){
        return listNhanVien;
    }
    public ArrayList<NhanVien> search(String searchPB){
        ArrayList<NhanVien> result = new ArrayList();
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getPhongBan().equals(searchPB)) {
                result.add(nhanVien);
              
            }
        }
        return result;
    }
     public void xoa(){
        int count = 0;
        System.out.println("Nhap chuc vu can xoa");
        String searchCV = sc.nextLine();
        for (int i = 0; i < listNhanVien.size(); i++) {
            if ( listNhanVien.get(i).getChucVu().equalsIgnoreCase(searchCV)) {
                listNhanVien.remove(i);
                count++;
                System.out.println("Xoa thanh cong"); 
                return;
            }
        }
         if (count == 0) {
                System.out.println("Ko tim thay");
            }
        
    }
}
