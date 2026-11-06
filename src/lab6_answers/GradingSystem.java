package lab6_answers;

import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        double grade = scanner.nextDouble();

        if (grade < 0.0 || grade > 100) {
            System.out.println("Invalid");
        } else {
            if (grade <= 59.49) {
                System.out.println("5.0 Failed");
            } else if (grade <= 64.99) {
                System.out.println("3.00 Fair");
            } else if (grade <= 70.49) {
                System.out.println("2.75 Fair");
            } else if (grade <= 75.99) {
                System.out.println("2.50 Satisfactory");
            } else if (grade <= 81.49) {
                System.out.println("2.25 Satisfactory");
            } else if (grade <= 86.49) {
                System.out.println("2.00 Satisfactory");
            } else if (grade <= 91.49) {
                System.out.println("1.75 Very Good");
            } else if (grade <= 94.49) {
                System.out.println("1.50 Very Good");
            } else if (grade <= 97.49) {
                System.out.println("1.25 Very Good");
            } else if (grade <= 100) {
                System.out.println("1.00 Excellent");
            }
        }
    }

}
