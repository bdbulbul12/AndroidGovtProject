
package day02;

import java.util.Scanner;


public class HomeTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any positive   number");
        int a = sc.nextInt();
        
        
        if(a%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
