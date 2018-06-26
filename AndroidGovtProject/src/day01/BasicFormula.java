
package day01;


public class BasicFormula {
    public static void main(String[] args) {
        int a=10;
        float b =10.25f;
        
        float square = a*a+2*a*b+b*b;
        float volume = a*a*a-b*b*b-3*a*b*(a-b);
        float cube = (a-b)*(a*b+a*b+b*b);
        
        
        System.out.println("(a+b)^2 = "+square);
        System.out.println("(a-b)^3 = "+volume);
        System.out.println("(a^3-b^3) = "+cube);
    }
}
