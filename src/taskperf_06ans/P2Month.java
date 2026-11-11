package taskperf_06ans;

import java.util.Scanner;

public class P2Month {

    public static void main(
            String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1-12: ");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("January");
            default -> System.out.println("Invalid input.");
        }
    }

}
