
package week14_looping_bsit1_1;

public class BreakContinueDemo {
    public static void main(String[] args) {
        int n = 0;   
        
        while( n < 10){                       
            n++;
            if (n == 7) {
                break;     //replace with continue to see difference
            }
            System.out.println("Number "+n); 
        }
    }
    
}
