package week13_selection;

import java.util.Scanner;

public class SarisariStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:\n1. pancit\tP35.00\n2. adobo\t\tP60.00\n3. chop seuy\tP45.0");
        double grandTotal = 0;

        int n = 0;      //init
        while (n < 2) {   //cond
            System.out.print("Annyeong sayo:  ");
            int item = scanner.nextInt();

            double price = 0;
            if (item == 1) {
                price = 35;
            } else if (item == 2) {
                price = 60;
            } else if (item == 3) {
                price = 45;
            } else {
                System.out.println("sorry walang ganyan dito");
            }

            if (price != 0) {
                System.out.print("Ilang order po? ");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                double total = quantity * price;
                System.out.println("Total order: P" + total);
                grandTotal += total;
            }
            n++;        //inc / dec
        }
        System.out.println("Grand Total: " + String.format("%.2f", grandTotal));
    }
}
