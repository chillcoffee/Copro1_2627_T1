package week13_selection;

import java.util.Scanner;

public class Score {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a whole number from 0-10: ");
        int n = scanner.nextInt();

        if (n > 10 || n < 0) {
            System.out.println("Invalid score.");
        } else {
            System.out.println("Valid");
        }
    }

}
