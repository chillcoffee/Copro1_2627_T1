package week13_selection;

import java.util.Scanner;

public class GatePass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        if (score >= 0 && score <= 10) {
            if (score <=4) {
                System.out.println("Study more");
            } else if (score <= 8) {
                System.out.println("Good");
            } else {
                System.out.println("Very good.");
            }
        } else {
            System.out.println("Invalid score.");
        }
        System.out.println("Thank you.");

//        if (score >= 9 && score <=10) {
//            System.out.println("Very good");
//        } else if (score >= 5) {
//            System.out.println("Good");
//        } else {
//            System.out.println("Study more");
//        }
    }
}
