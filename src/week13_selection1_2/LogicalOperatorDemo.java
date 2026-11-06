package week13_selection1_2;

import java.util.Scanner;

public class LogicalOperatorDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* valid grades 1-10
        8-10 very good
        5-7 good
        0-4 study more
         */
        System.out.println("Enter score: ");
        int score = scanner.nextInt();

        if (score >= 8 && score <= 10) {
            System.out.println("Very good!");
        } else if (score >= 5 && score <= 7) {
            System.out.println("Good.");
        } else if (score >= 0 && score <= 4) {
            System.out.println("Study more...");
        } else {
            System.out.println("Invalid score.");
        }
    }
}
