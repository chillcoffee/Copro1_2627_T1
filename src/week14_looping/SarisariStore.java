package week14_looping;

import java.util.Scanner;

public class SarisariStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ans = "yes";
        do{
            double price = 0;
        
            System.out.println("\n\nItems:\n1. Pancit Canton\tP15.00\n2. Sardinas\t\tP25.00\n3. Swak\t\t\tP16.00");
            System.out.println("Anong bilhin mo? ");
            int item = scanner.nextInt();

            if (item == 1) {
                price = 15.0;
            } else if (item == 2) {
                price = 25.0;
            } else if (item == 3) {
                price = 16.0;
            } else{
                System.out.println("Sorry, out of stock.");
            } 

            if(price != 0){
                System.out.println("Ilang piraso: ");
                int quantity = scanner.nextInt(); scanner.nextLine();
                double total = price * quantity;
                System.out.println("Total: " + total);
            }
            System.out.println("Bili ka pa ba?[yes/no]: ");
            ans = scanner.nextLine().toLowerCase();
        }while( ans.equals("yes"));
            
        
    }
}
