package week13_selection1_2;

import java.util.Scanner;

public class CharAtDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 0;
        System.out.println("Items:\na. Pancit Canton\tP15.00\nb. Sardinas\t\tP25.00\nc. Swak\t\t\tP16.00");
        System.out.println("Anong bilhin mo? ");
        char item = scanner.next().charAt(0);
        
        
        switch (item) {
            case 'a':
                price = 15.0;
                break;
            case 'b':
                price = 25.0;
                break;
            case 'c':
                price = 16;
                break;
            default:
                System.out.println("Sorry, out of stock.");
        }

        if (price != 0) {
            System.out.println("Ilang piraso: ");
            int quantity = scanner.nextInt();
            double total = price * quantity;
            System.out.println("Total: " + total);
        }

    }

}
