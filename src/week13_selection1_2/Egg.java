package week13_selection1_2;

import java.util.Scanner;

public class Egg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        I: eggNo
        P: eggNo = 6 -> 45, eggNo = 12 -> 90
        O: totalAmountDue
         */

        System.out.print("How many eggs? ");     //prompt or instructions
        int eggNo = scanner.nextInt();
        double price = 0;
        //     7 == 6
        
//        switch(eggNo){
//            case 6,7,8,9,10,11, 12:
//                price = 45;
//                break;
//            case 12:
//                price = 90
//                break;
//            default:
//                
//        }
        if (eggNo >= 6) {
            price = 45.0;
        } else if(eggNo == 12){
            price = 90;

        } else if(eggNo == 30){
            price = 210.0;
        } else{
            price = eggNo * 8;
        }     
        System.out.println("Total Amount Due: "+price);
    }

}
