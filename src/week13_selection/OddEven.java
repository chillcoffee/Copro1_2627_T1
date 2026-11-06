package week13_selection;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        double num = scanner.nextDouble();

        if (num > 0) {
            if (num % 2 == 1) {
                System.out.println("Odd");
            } else {
                System.out.println("Even");
            }
        } else if (num == 0) {
            System.out.println("Neither odd or even.");
        } else if (num < 0) {
            if (num % 2 == -1) {
                System.out.println("Odd");
            } else {
                System.out.println("Even");
            }
        }

    }
}
