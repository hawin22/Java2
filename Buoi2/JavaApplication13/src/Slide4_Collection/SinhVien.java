/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide4_Collection;

/**
 *
 * @author Hawin
 */
public class SinhVien {
    private String name;
    private double marks;

    public SinhVien() {
    }

    public SinhVien(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "name=" + name + ", marks=" + marks + '}';
    }
    
}
