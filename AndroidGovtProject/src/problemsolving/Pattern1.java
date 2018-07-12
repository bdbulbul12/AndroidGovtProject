
package problemsolving;

import java.util.Scanner;


public class Pattern1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int row = 1; row <=n; row++) {
            
            for (int col = 1; col <=n-row; col++) 
                System.out.print(" ");
                
            for (int i = 1; i <=row; i++) 
                System.out.print("* ");
            
            System.out.print("\n");
            
            
        }
    }
}
