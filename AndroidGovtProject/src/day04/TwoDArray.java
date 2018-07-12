
package day04;

import java.util.Scanner;

public class TwoDArray {
     public static void main(String[] args) {
        //int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        
        Scanner sc = new Scanner(System.in);
        
        int [][] a = new int[4][4];
        
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a.length; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("--------------------");
        
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            
            System.out.println("");
        }
        
        
        
    }
}
