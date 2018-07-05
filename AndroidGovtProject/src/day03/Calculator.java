
package day03;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i <10; i++) {
            int x = sc.nextInt();
            char sign = sc.next().charAt(0);
            int y = sc.nextInt();
            
            switch(sign){
                case '+':
                    System.out.println(x+y);
                    break;
                case '-':
                    System.out.println(x-y);
                    break;
                case '*':
                    System.out.println(x*y);
                    break;
                    
                case '/':
                    System.out.println(x/y);
                    break;
                default:
                    System.out.println("Wrong sign");
            }
        }
    }
}
