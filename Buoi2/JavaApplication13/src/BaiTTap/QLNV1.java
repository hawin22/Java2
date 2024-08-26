    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTTap;

import java.util.ArrayList;

/**
 *
 * @author Hawin
 */
public class QLNV1 {

    ArrayList<NhanVien1> listNhanVien = new ArrayList<>();

    public QLNV1() {
        listNhanVien.add(new NhanVien1("Hawin", "Nữ", "SD18405"));
        listNhanVien.add(new NhanVien1("Nam", "Nam", "SD18404"));
        listNhanVien.add(new NhanVien1("Thu", "Nữ", "SD18406"));
    }

    ArrayList<NhanVien1> getListNhanVien() {

        return listNhanVien;
    }

    Boolean addNew(NhanVien1 nhanVien) {
        listNhanVien.add(nhanVien);
        return true;
    }
    Boolean delete(int viTri){
        listNhanVien.remove(viTri);
        return true;
    }
    Boolean update(int viTri, NhanVien1 nhanVienNew){
     listNhanVien.set(viTri, nhanVienNew);
     return true;
    }
    ArrayList<NhanVien1> search(String tenCanTim){
        ArrayList<NhanVien1> listKetQua = new ArrayList<>();
        for (NhanVien1 nhanVien1 : listNhanVien) {
            if (nhanVien1.getTenDN().equals(tenCanTim)) {
                listKetQua.add(nhanVien1);
            }
        }
        return listKetQua;
    }
}
