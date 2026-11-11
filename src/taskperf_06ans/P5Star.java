
package taskperf_06ans;

import java.util.Scanner;

public class P5Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines of asterisks would you like to see? ");
        int maxLine = scanner.nextInt();
        System.out.println("Choose a shape: \n\t1. Square\n\t2. Triangle");
        int shape = scanner.nextInt();
        
        if(shape == 1){
            for(int line=0; line < maxLine; line++){
                for(int star = 1; star <= maxLine; star++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }else{
            for(int line=0; line < maxLine; line++){
                for(int star = 0; star <= line; star++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
            
        }
    }
    
}
