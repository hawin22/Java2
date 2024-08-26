/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18405.java1;

import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class Exception {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a ");
        Integer a = null;
        try {
            a = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Da chay vao day");
        }
//        a = Integer.parseInt(sc.nextLine());
        System.out.println("So a la: " + a);

    }
}
