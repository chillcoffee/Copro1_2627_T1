package week14_forLoop_bscpe;

import java.util.Scanner;

public class ForDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.print("What is your name: ");
//        String name = scanner.nextLine();

//        System.out.print("How many times would you like to see your name? ");
//        int times = scanner.nextInt();
//        int n = 0;
//        while(n < times){
//            System.out.println(name);
//            n++;
//        }

        for (int n = 0; n <= 10; n++)
        {            
            if(n == 4)
                continue;
            System.out.println(n);
        }


    }
}
