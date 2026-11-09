
package week14_forLoop_bscpe;

import java.util.Scanner;


public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        for(int line=0; line<number; line++){
            for(int star=0; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
