package week14_forLoop_bscpe;

import java.util.Scanner;

public class BreakDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = {2, 9, 1, 4, 25, 50};
        System.out.println("Enter a number to be searched: ");
        int search = scanner.nextInt();
        boolean nahanap = false;
        for(int i=0; i < num.length; i++){
            if(num[i] == search){
                System.out.println("Data is found at index "+i);
                nahanap = true;
                return;
            }
        }
        
        if(nahanap == false){
            System.out.println("Data not found.");
        }
            
        
        System.out.println("HaHa thank you!");
    }

}
