/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day04;

import java.util.Scanner;

/**
 *
 * @author bulbul
 */
public class MinNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int[] x = new int[5];

        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
            if (i == 0) {
                min = x[0];
            }
            if (x[i] < min) {
                min = x[i];
            }
        }
        System.out.println(min);
    }
}
