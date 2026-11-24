
package finals;

import java.util.Random;
import java.util.Scanner;

public class SampleTP {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String words[] = {"microscope", "telephone", "function", "constructor"};
        
        Random rand = new Random();
        String tobeGuessed = words[rand.nextInt(4)];
        
        char letters[] = tobeGuessed.toCharArray(); //string method
        
        for(int i=0; i<letters.length; i++){
            System.out.print("_ ");
        }
        while(true){ //bad practice infinite loop
            System.out.print("\nGuess a letter: ");
            char guess = scan.next().charAt(0);

            for(int i=0; i<letters.length; i++){
                if(letters[i] == guess)
                    System.out.print(guess+" ");
                else
                    System.out.print("_ ");
            }
        }
    }
    
}
