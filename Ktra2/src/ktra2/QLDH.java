/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ktra2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Hawin
 */
public class QLDH {

    ArrayList<DongHo> listDongHo = new ArrayList<>();

    public QLDH() {
        listDongHo.add(new DongHo("Hawin", "Người lớn", 2));
        listDongHo.add(new DongHo("Thúy", "Trẻ em", 3));
        listDongHo.add(new DongHo("Trang", "Người lớn", 1));
        listDongHo.add(new DongHo("Phương", "Người lớn", 2));
    }

    ArrayList<DongHo> getListDongHo() {
        return listDongHo;
    }

    Boolean add(DongHo dh) {
        if (dh.getSoLuong() < 0) {
            return false;
        }
        listDongHo.add(dh);
        return true;
    }

    Boolean remove(int viTri) {
        listDongHo.remove(viTri);
        return true;
    }

    public String ghiFile(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
                try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    for (DongHo dongHo : listDongHo) {
                        oos.writeObject(dongHo);
                    }
                }

            }
            return "Ghi thành công";
        } catch (Exception e) {
            return "Ghi thất bại";
        }
    }
}
