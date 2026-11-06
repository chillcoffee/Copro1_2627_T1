
package lab6_answers;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        
        int digit = num % 10;
        if(digit % 2 == 1){
            System.out.println("The last digit of your number "+num+" is "+digit+" and it is odd.");
        }else{
            System.out.println("The last digit of your number "+num+" is "+digit+" and it is even.");
        }
    }
    
}
