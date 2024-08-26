/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Tạo class NhanVien: maNhanVien: String, tenNhanVien: String, luongCoBan: Int, phongBan: String, chucVu: String, namSinh Int, gioiTinh Bool
- Nhập danh sách nhân viên
- Hiển thị thông tin danh sách
- Tìm kiếm nhân viên theo phòng ban
- hiển thị thông tin nhân viên kèm tuổi =2023 - năm sinh
 * @author Hawin
 */

public class QLNV {
    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> listNhanVien = new ArrayList<>();
    public void nhap(){
        System.out.println("Nhap ma nhan vien: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ten nhan vien ");
        String ten = sc.nextLine();
        System.out.println("Nhap luong");
        Integer luong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap phong ban ");
        String phongBan = sc.nextLine();
        System.out.println("Nhap chuc vu: ");
        String chucVu = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Integer tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh: ");
        boolean gioiTinh = Boolean.parseBoolean(sc.nextLine());
        NhanVien nhanVien = new NhanVien(ma, ten, luong, phongBan, chucVu, tuoi, gioiTinh);
        listNhanVien.add(nhanVien);
    }
    public ArrayList<NhanVien> xuatNhanVien(){
        return listNhanVien;
    }
    
    public ArrayList<NhanVien> search(String searchPB){
        ArrayList<NhanVien> result = new ArrayList<>();
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getPhongBan().equals(searchPB)) {
                result.add(nhanVien);
            }
        }
        return result;
    }
    public void addNamSinh(){
        for (NhanVien nhanVien : listNhanVien) {
            System.out.println(nhanVien.toString());
            int namSinh = 2023 - nhanVien.getTuoi();
            System.out.println("Nam sinh: "+ namSinh);
        }
       
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
            if (count == 0) {
                System.out.println("Ko tim thay");
            }
            
        }
        
    }
}
