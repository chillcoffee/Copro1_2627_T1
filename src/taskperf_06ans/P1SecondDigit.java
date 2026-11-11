
package taskperf_06ans;

import java.util.Scanner;

public class P1SecondDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();
        
        int secondDigit = number % 100 / 10;
        System.out.println(secondDigit);
        if(secondDigit % 2 == 0 )
            System.out.println("The second digit of your number("+number+") is "+secondDigit+" and it is even.");
        else
            System.out.println("The second digit of your number("+number+") is "+secondDigit+" and it is odd.");
    }
    
}
