
package week14_bsit1_2;

import java.util.Scanner;

public class BreakDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to find: ");
        int search = scanner.nextInt();
        boolean flag = false;
        
        int num[] = {2, 9, 1, 4, 25, 50};
        for(int i = 0; i < num.length; i++){
            if(num[i] == search){
                System.out.println("Data is found at index "+i);
                flag = true;
                break;
            }
            
        }
        if(flag == false){
            System.out.println("Not found.");
        }
    }
}
