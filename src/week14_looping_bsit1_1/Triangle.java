
package week14_looping_bsit1_1;

public class Triangle {
    public static void main(String[] args) {
        int i = 5;
        for(int line = 0; line < i; line++){
            for(int star = 0; star <= line; star++){
                System.out.print("*");
            }
            System.out.println();  
        }
        
    }
    
}
