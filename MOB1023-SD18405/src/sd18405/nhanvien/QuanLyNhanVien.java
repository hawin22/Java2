/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18405.nhanvien;

import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class QuanLyNhanVien {

    ArrayList<NhanVien> listNhanVien = new ArrayList<>();

    public QuanLyNhanVien() {
        listNhanVien.add(new NhanVien("NV1", "Nguyen Van A", "Nam", "SD1232"));
        listNhanVien.add(new NhanVien("NV2", "Nguyen Van B", "Nam", "SD1234"));
        listNhanVien.add(new NhanVien("NV3", "Nguyen Van C", "Nữ", "SD1235"));
    }

    ArrayList<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    Boolean addNew(NhanVien nhanVien) {
        listNhanVien.add(nhanVien);
        return true;
    }

    Boolean delete(int vitri) {
        listNhanVien.remove(vitri);
        return true;
    }
    
    Boolean update(int vitri, NhanVien nhanVienNew){
        listNhanVien.set(vitri, nhanVienNew);
        return true;
    }
    
    ArrayList<NhanVien> search(String tenCanTim){
        ArrayList<NhanVien> listKetQua = new ArrayList<>();
        for(NhanVien nhanVien: listNhanVien){
            if (nhanVien.getHoTen().equals(tenCanTim)) {
                listKetQua.add(nhanVien);
            }
        }
        return listKetQua;
    }
}
