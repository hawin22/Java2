
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.stream.FileCacheImageInputStream;

/**
 *
 * @author Hawin
 */
public class QLNV implements NhanVienInter {

    ArrayList<NhanVien> listNhanVien = new ArrayList();

    private static final String P_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";

    public QLNV() {
        listNhanVien.add(new NhanVien("PH01", "Hawin", 21, "thu@gmail.com", 3453135.0));
        listNhanVien.add(new NhanVien("PH02", "Phạm Như", 25, "phamNhu@gmail.com", 8500.0));
        listNhanVien.add(new NhanVien("PH03", "Tùng Lâm", 31, "tungLam@gmail.com", 4200.0));
        listNhanVien.add(new NhanVien("PH04", "Kiều Trang", 19, "trangDuong@gmail.com", 3300.0));
    }

    @Override
    public ArrayList<NhanVien> fakeData() {

        return listNhanVien;
    }

    ArrayList<NhanVien> getListNhanVien() {

        return listNhanVien;
    }

    ArrayList<NhanVien> search(String maCanTim) {
        ArrayList<NhanVien> listResult = new ArrayList<>();
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getMaNV().equals(maCanTim)) {
                listResult.add(nhanVien);
            }
        }
        return listResult;
    }

    public String ghiFile(String fn) {
        File file = new File(fn);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (NhanVien nhanVien : listNhanVien) {
                    oos.writeObject(nhanVien);
                }
            }
            return "Ghi thành công";
        } catch (Exception e) {
            return "Ghi thất bại";
        }
    }

    public String docFile(String fn) {
        File file = new File(fn);
        try {
            if (!file.exists()) {
                return "Không thấy file";
            }
            try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    listNhanVien.add((NhanVien) ois.readObject());
                }
            }
            return "Đọc thành công";
        } catch (Exception e) {
            return "Đọc thất bại";
        }
    }

    Boolean addNhanVien(NhanVien nhanVien) {
        listNhanVien.add(nhanVien);
        return true;
    }

    Boolean checkma(NhanVien nhanVien1) {
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getMaNV().equals(nhanVien1.getMaNV())) {
                return true;
            }
        }
        return false;
    }

    Boolean capNhatSave(int vitri, NhanVien nhanVienNew) {
        if (vitri >= 0 && vitri < listNhanVien.size()) {
            NhanVien nhanVienCu = listNhanVien.get(vitri);

            if (nhanVienCu.getMaNV().equals(nhanVienNew.getMaNV())
                    && nhanVienCu.getHoTen().equals(nhanVienNew.getHoTen())
                    && (Objects.equals(nhanVienCu.getTuoi(), nhanVienNew.getTuoi()))
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

    public static Boolean checkEmail(String email) {
        if (email == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(P_EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    ArrayList<NhanVien> delete(String maNV) {
        ArrayList<NhanVien> listResult = new ArrayList<>();
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getMaNV().equals(maNV)) {
                listResult.remove(nhanVien);
            } else {
                listResult.add(nhanVien);
            }
        }

        return listResult;
    }
    
     Boolean update(int viTri, NhanVien nhanVienNew){
     listNhanVien.set(viTri, nhanVienNew);
     return true;
    }

}
