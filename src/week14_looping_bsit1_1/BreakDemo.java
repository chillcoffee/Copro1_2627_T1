
package week14_looping_bsit1_1;

import java.util.Scanner;

public class BreakDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num[] = {2, 9, 1, 4, 25, 50};
        boolean nahanap = false;
        System.out.println("What would you like to find: ");
        int search = scanner.nextInt();
        
        for(int i = 0; i < num.length; i++){
            if(num[i] == search){
                System.out.println("Data is found at index " +i);
                nahanap = true;
                break;
            }
            
        }
        if(nahanap == false)
            System.out.println("Hindi nahanap.");
    }
}
