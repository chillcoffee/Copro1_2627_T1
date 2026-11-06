package lab1;

import java.util.Scanner;

public class SariSariStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anong bibilhin mo? ");
        String item = scanner.nextLine();
        System.out.print("Enter price of "+item+": ");
        double price = scanner.nextDouble();
        System.out.println("Ilang "+item+" ang bibilhin mo?");
        int quantity = scanner.nextInt();
        System.out.println("Total: "+price * quantity);
    }
    
}
