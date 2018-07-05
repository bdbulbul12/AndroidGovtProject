
package day03;


public class SwitchStatement {
    
    public static void main(String[] args) {
        
        char ch  ='A';
        
        switch(ch){
            case 'A':
                System.out.println("Case A");
                break;
           case 'B' :
		System.out.println("Case B");
            default:
                System.out.println("Default case");
                break;
        }
    }
}
