/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ktra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * private int ID; private String Ten; private int NamSinh; private String
 * PhongBan; 3. Tìm kiếm nhân viên theo phòng ban 2đ 4. Xoá nhân viên theo ID 2đ
 *
 * @author Hawin
 */
public class QLNV {

    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> listNhanVien = new ArrayList();

    public QLNV() {
        listNhanVien.add(new NhanVien(01, "Phạm Như", 2002, "Phòng ban 1"));
        listNhanVien.add(new NhanVien(02, "Trần Nhân", 2002, "Phòng ban 2"));
        listNhanVien.add(new NhanVien(03, "Tùng Lâm", 2002, "Phòng ban 3"));
        listNhanVien.add(new NhanVien(04, "Nguyễn Phương", 2002, "Phòng ban 4"));
    }
    
    
    
    ArrayList<NhanVien> getListNhanVien(){
       
        return listNhanVien;
    }
    Boolean addNew(NhanVien nhanVien){
        listNhanVien.add(nhanVien);
        return true;
    }

    public void nhapTT() {
        System.out.println("Nhap id: ");
        Integer ID = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        Integer namSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap phong ban: ");
        String phongBan = sc.nextLine();
        NhanVien nhanVien = new NhanVien(ID, ten, namSinh, phongBan);
        listNhanVien.add(nhanVien);
    }

    public ArrayList<NhanVien> xuatTT() {
        return listNhanVien;
    }

    public ArrayList<NhanVien> search(String searchPB) {
        ArrayList<NhanVien> result = new ArrayList<>();
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getPhongBan().equals(searchPB)) {
                result.add(nhanVien);

            }
        }
        return result;
    }

    public void xoa() {
        int count = 0;
        System.out.println("Nhap id can xoa: ");
        Integer removeID = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getID() == removeID) {
                listNhanVien.remove(i);
                count++;
                System.out.println("Da xoa ");

            }
        }
        System.out.println("DS sau khi xoa");
        for (NhanVien nhanVien : listNhanVien) {
            System.out.println(nhanVien.toString());
        }
        if (count == 0) {
            System.out.println("Ko tim thay");
        }
    }
}
