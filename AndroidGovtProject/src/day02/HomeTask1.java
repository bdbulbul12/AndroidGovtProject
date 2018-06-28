package day02;

import java.util.Scanner;

public class HomeTask1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, num1;
        float num2;

        System.out.println("Enter the value of Number1 and Number 2");
        num1=sc.nextInt();
        num2=sc.nextFloat();
        
        System.out.println("Enter the value of i & j ");
        i=sc.nextInt();
        j=sc.nextInt();
        
        if(i==1 && j==2){
            System.out.println("Addition is "+(num1+num2));
        }else if(i==0 && j<5){
            System.out.println("Substract is "+(num1-num2));
        }else if(i>20 || j<=20){
            System.out.println("Multiplication is "+(num1*num2));
        }else if(i==30 || j==15){
            System.out.println("Division is "+(num1/num2));
        }else{
            System.out.println("Input is wrong");
        }

    }
}
