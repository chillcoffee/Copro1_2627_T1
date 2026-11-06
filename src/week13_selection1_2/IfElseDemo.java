package week13_selection1_2;

import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        
        if(number > 0){
            System.out.println("Positive");
        }else if(number < 0){
            System.out.println("Negative");
        }else if (number == 0){
            System.out.println("Number is zero.");
        }
    }
}
