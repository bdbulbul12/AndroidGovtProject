
package day04;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;

        int[] x = new int[5];

        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
            if (x[i] > max) {
                max = x[i];
            }

        }
        System.out.println(max);

    }
}
