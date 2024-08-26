/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18405.swing;

/**
 *
 * @author nguyenvv
 */
public class SV {

    private String name;
    private Double marks;

    public SV(String name, Double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "SV{" + "name=" + name + ", marks=" + marks + '}';
    }

   

}
