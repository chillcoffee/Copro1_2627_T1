
package finals;

import java.util.Random;
import java.util.Scanner;

public class SampleTP {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String words[] = {"microscope", "telephone", "function", "constructor"};
        
        Random rand = new Random();
        String tobeGuessed = words[rand.nextInt(4)]; //words[2]
        
        char letters[] = tobeGuessed.toCharArray(); // toCharArray() is a String method
        
        for(int i=0; i<letters.length; i++){
            System.out.print("_ ");
        }
        int tries = 0;
        while(tries < 3){ 
            System.out.print("\nGuess a letter: ");
            char guess = scan.next().charAt(0);

            for(int i=0; i<letters.length; i++){
                if(letters[i] == guess)
                    System.out.print(guess+" ");
                else
                    System.out.print("_ ");
            }
            
            tries++;
        }
    }
    
}
