package week12_control_structure;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number.");
        int num = scanner.nextInt();

        if (num < 0) {
            if (num % 2 == -1) {
                System.out.println("Negative number is odd.");
            } else {
                System.out.println("Negative number is even.");
            }
        } else if (num == 0) {
            System.out.println("Num is zero");
            System.out.println("Halaka");
        } else {
            if (num % 2 == 1) {
                System.out.println("Num is Odd");
                System.out.println("Hurray");
            } else {
                System.out.println("Num is even");
                System.out.println("Hephep");
            }
        }

    }

}
