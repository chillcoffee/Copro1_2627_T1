/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_answers;

import java.util.Scanner;

/**
 *
 * @author RS
 */
public class MiddleInitial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your middle initial: ");
        char mi = scanner.next().toLowerCase().charAt(0);
        
        if(mi == 'a' || mi == 'e' || mi == 'i' || mi == 'o' || mi == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
                
    }
    
}
