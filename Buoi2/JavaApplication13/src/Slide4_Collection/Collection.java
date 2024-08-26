/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide4_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Hawin
 */
public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(3);
        
        list.forEach(x -> System.out.println("\t" + x));
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(2);
          System.out.println(set.toString());
          
        List<Integer> listList = new ArrayList();
        listList.add(5);
        listList.add(7);
        listList.add(7);
        
         System.out.println(listList.toString());

        
    }
}
