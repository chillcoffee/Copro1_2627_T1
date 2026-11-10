
package week14_looping_bsit1_1;

public class WhileDemo {
    public static void main(String[] args) {
        
        int n = 0;
        while( n < 10){           
            System.out.println("Number "+n); 
            if(n == 5)
                return;
            n++;
        }
        System.out.println("Thank you! blablabla");
        
    }
    
}
