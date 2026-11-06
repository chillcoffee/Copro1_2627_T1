package lab6_answers;

import java.util.Scanner;

public class Delivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Magkano yung parcel po? ");
        double parcel = scanner.nextDouble();
        System.out.println("Bayad ko: ");
        double money = scanner.nextDouble();

        if (money > parcel) {
            System.out.println("yay may sukli");
        } else if (money == parcel) {
            System.out.println("walang sukli");
        } else {
            System.out.println("Kulang guid");
        }
    }
}
