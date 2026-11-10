
package week14_looping_bsit1_1;

import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        /*
        Display user's name n times.
        I name, how many times = times
        P repeat sout kung ilang beses yung times na ininput
            //init
            while(cond){
                sout   (name)
                inc
            }
        O user's name n times
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How many times would you like to see your name? ");
        int times = scanner.nextInt();
        int n = 0;
        while( n < times){           
            System.out.println(name); 
            n++;
        }
        
    }
}
