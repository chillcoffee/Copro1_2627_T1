
package finalcpe;

import java.util.Scanner;

public class SampleTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "ballpen";
        
        char letter[] = word.toCharArray();        
        for(int i=0; i < word.length(); i++){
            System.out.print("_ ");
        }
        
        int tries = 0;
        while(tries < 3){
            System.out.print("\nEnter a letter: ");
            char guess = scanner.next().charAt(0);

            for(int i=0; i < word.length(); i++){
                if(letter[i] == guess)
                    System.out.print(guess+" ");
                else
                    System.out.print("_ ");
            }
            tries++;
        }
    }
    
}
