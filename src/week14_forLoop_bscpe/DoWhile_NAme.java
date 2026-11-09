package week14_forLoop_bscpe;

import java.util.Scanner;

public class DoWhile_NAme {

    public static void main(String[] args) {
        /*
        I: name, times
        P: loop n times, show name each time
        1. 
            init
            while(cond){
                sout name
                inc
            }
        O: name showed n times
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = scanner.nextLine();

        System.out.print("How many times would you like to see your name? ");
        int times = scanner.nextInt();
        int n = 0;
        do{
            System.out.println(name);
            n++;
        }while(n < times);
    }
}
