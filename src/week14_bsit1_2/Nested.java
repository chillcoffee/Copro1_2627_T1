package week14_bsit1_2;

import java.util.Scanner;

public class Nested {

    public static void main(String[] args) {
        /*
        0-5 good
        6-10 very good
        valid score 0-10
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score: ");
        int score = scanner.nextInt();

//        if (score < 0 || score > 10) {
//            System.out.println("Invalid score.");
//        } else {
//            System.out.println("Valid");
//            if (score <= 5) {
//                System.out.println("Good");
//            } else {
//                System.out.println("Very good.");
//            }
//        }

        if(score >= 0 && score <= 10){
            if (score <= 5) {
                System.out.println("Good");
            } else {
                System.out.println("Very good.");
            }
        }else{
            System.out.println("Invalid");
        }
    }

}
