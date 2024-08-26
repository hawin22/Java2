/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        Integer a = null;
        try {
            a = Integer.parseInt(sc.nextLine());
       
        } catch (NumberFormatException ex) {
            System.out.println("chay ben trong try_catch");
        }
         System.out.println("So a: " + a);
        
    }
}
