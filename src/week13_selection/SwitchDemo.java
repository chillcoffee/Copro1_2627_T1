package week13_selection;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:\n1. pancit\tP35.00\n2. adobo\t\tP60.00\n3. chop seuy\tP45.0");
        double grandTotal = 0;
        int n = 0;      //init
        while (n < 1) {   //cond
            System.out.print("Annyeong sayo:  ");
            String item = scanner.nextLine().toLowerCase();

            double price = 0;

            switch (item) {
                case "pancit":
                    price = 35;
                    break;
                case "adobo":
                    price = 60;
                    break;
                case "chop seuy":
                    price = 45;
                    break;
                default:
                    System.out.println("Invalid ulam.");
            }

            if (price != 0) {
                System.out.print("Ilang order po? ");
                int quantity = scanner.nextInt();
                double total = quantity * price;
                System.out.println("Total order: P" + total);
                grandTotal += total;
            }

            n++;        //increment
        }
        System.out.println("Grand Total: " + String.format("%.2f", grandTotal));
    }
}
