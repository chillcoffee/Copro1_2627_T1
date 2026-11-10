
package week14_looping_bsit1_1;

public class ForDemo {
    public static void main(String[] args) {
        
        for(int ctr = 0; ctr < 10; ctr++){
            if(ctr == 5 || ctr == 6)
                break;            
            System.out.println("Number "+ctr);
        }
    }
    
}
