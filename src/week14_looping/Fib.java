
package week14_looping;

import java.util.Scanner;


public class Fib {
    public static void main(String[] args) {
        int i1 = 1, i2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fib(x): ");
        int limit = scanner.nextInt();
        int counter = 1;
        System.out.println(i1);
        while(counter < limit){
            System.out.println(i2);
            i2 += i1;
            i1 = i2 - i1;
            counter++;
        }
    }
    
}
