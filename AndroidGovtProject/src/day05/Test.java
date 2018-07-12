/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05;

import java.util.ArrayList;

/**
 *
 * @author bulbul
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> stdList = new ArrayList<Student>();
        stdList.add(new Student(1,"Bulbul",3.15));
        stdList.add(new Student(2,"Bulbul",3.15));
        stdList.add(new Student(3,"Bulbul",3.15));
        
        for (Student   s : stdList) {
            System.out.println(s);
        }
    }
}
