/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Hawin
 */
public class QLNV {
    
    private String ID;
    private String Ten;
    private String gioiTinh;
    private int tuoi;

    public QLNV() {
    }

    public QLNV(String ID, String Ten, String gioiTinh, int tuoi) {
        this.ID = ID;
        this.Ten = Ten;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

 
    
}
