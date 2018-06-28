/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day02;

import java.util.Scanner;

/**
 *
 * @author bulbul
 */
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any Number");
        
        int number = sc.nextInt();
        
        System.out.println("The user is Entered:"+number);
    }
}
