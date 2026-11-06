
package week14_looping;

import java.util.Scanner;


public class Summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter summation(x): ");
        int limit = scanner.nextInt();
        
        int number = 1, total = 0;
        while(number <= limit){
            total += number;
            number++;
        }
        System.out.println("Total: "+total);
    }
}
