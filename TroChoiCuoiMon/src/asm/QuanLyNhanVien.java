/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class QuanLyNhanVien {

    ArrayList<NhanVien> listNhanVien = new ArrayList<>();

    public QuanLyNhanVien() {
        listNhanVien.add(new NhanVien("NV01", "Nguyễn Hữu Nghĩa", "23", "nghianhph46340@gmail.com", 9999999.87878));
        listNhanVien.add(new NhanVien("NV02", "Hoàng Thọ Chính", "18", "chinh12345@gmail.com", 922999.87878));
        listNhanVien.add(new NhanVien("NV03", "Phạm Thị Quỳnh Thu", "21", "Thuptq@gmail.com", 978999.87878));
        listNhanVien.add(new NhanVien("NV04", "Phùn Văn Lềnh", "20", "lenhpvph46331@gmail.com", 6799999.87878));
    }

    ArrayList<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    ArrayList<NhanVien> search(String maCanTim) {
        ArrayList<NhanVien> listResult = new ArrayList<>();
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getMaNhanVien().equals(maCanTim)) {
                listResult.add(nhanVien);
            }
        }
        return listResult;
    }

    Boolean addNhanVien(NhanVien nhanVien) {
        listNhanVien.add(nhanVien);
        return true;
    }

    Boolean checkma(NhanVien nhanVien1) {
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getMaNhanVien().equals(nhanVien1.getMaNhanVien())) {
                return true;
            }
        }
        return false;
    }

    Boolean capNhatSave(int vitri, NhanVien nhanVienNew) {
        if (vitri >= 0 && vitri < listNhanVien.size()) {
            NhanVien nhanVienCu = listNhanVien.get(vitri);

            if (nhanVienCu.getMaNhanVien().equals(nhanVienNew.getMaNhanVien())
                    && nhanVienCu.getHoVaTen().equals(nhanVienNew.getHoVaTen())
                    && nhanVienCu.getTuoi().equals(nhanVienNew.getTuoi())
                    && nhanVienCu.getEmail().equals(nhanVienNew.getEmail())
                    && Objects.equals(nhanVienCu.getLuong(), nhanVienNew.getLuong())) {

                return false;
            }

            listNhanVien.set(vitri, nhanVienNew);
            return true;
        } else {
            return false;
        }
    }

    ArrayList<NhanVien> delete(String maNV) {
        ArrayList<NhanVien> listSauKhiXoa = new ArrayList<>();
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getMaNhanVien().equals(maNV)) {
                listSauKhiXoa.remove(nhanVien);
            } else {
                listSauKhiXoa.add(nhanVien);
            }
        }

        return listSauKhiXoa;
    }
}
