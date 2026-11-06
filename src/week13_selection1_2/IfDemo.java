package week13_selection1_2;

import java.util.Scanner;

public class IfDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Malakas ulan? ");
        String naulan = scanner.nextLine().toLowerCase();
        
        if (naulan.equals("huo")) {
            System.out.println("5 mins");
        } else if(naulan.equals("bukon")){
            System.out.println("Bangon eon uy!");
        }
    }
}
