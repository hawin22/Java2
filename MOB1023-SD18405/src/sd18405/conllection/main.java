/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18406.conllection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nguyenvv
 */
public class main {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println(list.toString());
        
        Set<Integer> listSet = new HashSet<>();
        listSet.add(1);
        listSet.add(2);
        listSet.add(2);
        System.out.println(listSet.toString());
    }
    
}
