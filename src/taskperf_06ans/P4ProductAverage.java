
package taskperf_06ans;

import java.util.Scanner;

public class P4ProductAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers would you like to multiply? ");
        int no = scanner.nextInt();
        
        int ctr = 1, product = 1, average, number, total = 0;
        while(ctr <= no){
            System.out.print("Enter "+ctr);
            if(ctr == 1) System.out.print("st ");
            else if(ctr == 2) System.out.print("nd ");
            else if(ctr == 3) System.out.print("rd ");
            else System.out.print("th ");
            System.out.print(" number: ");
            number = scanner.nextInt();
            product *= number;
            total += number;
            ctr++;
        }
        average = total / no;
        System.out.println("Product: "+product);
        System.out.println("Average: "+average);
        
    }
    
}
