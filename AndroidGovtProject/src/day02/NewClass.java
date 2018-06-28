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
public class NewClass {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       
       int i,j,num1;
       float num2;
       
       System.out.println("Enter the value of Num1 and Num2");
       num1=sc.nextInt();
       num2=sc.nextFloat();
       
       System.out.println("Enter value of i & j");
       
       i = sc.nextInt();
       j=sc.nextInt();
       
       if(i==1 && j==2){
           System.out.println("Addition is "+(num1+num2));
       }else if(i==0 && j<5){
           System.out.println("Substraction is "+(num1-num2));
       }else if(i>20 || j<=20){
           System.out.println("Multiplication is "+(num1*num2));
       }else if(i==0 || j==15){
           System.out.println("Subtraction is "+(num1/num2));
       }else{
           System.out.println("Wrong input");
       }
    }
}
