package week12_control_structure;

import java.util.Scanner;

public class Karenderia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 0.0, order;
        System.out.println("Menu\n\t1. adobo\tP50.00");
        System.out.println("\t2. pancit\tP35.00");
        System.out.println("\t3. menudo\tP75.00");

        System.out.println("Ano bibilhin mo? ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            price = 50.0;
        } else if (choice == 2) {
            price = 35.0;
        } else if (choice == 3) {
            price = 75.0;
        } else {
            System.out.println("Item does not exist in the menu");
        }

        if (price != 0) {
            System.out.println("Ilang order po: ");
            System.out.println("Ilang order po: ");
            order = scanner.nextInt();

            double total = price * order;
            System.out.println("Total: " + total);
        }

        System.out.println("Thank you.");
    }

}
