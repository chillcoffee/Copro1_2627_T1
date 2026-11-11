
package taskperf_06ans;

import java.util.Scanner;

public class P3Between {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int firstNum = scanner.nextInt();
        
        System.out.println("Enter a number: ");
        int secondNum = scanner.nextInt();
        
        if(firstNum > secondNum){
            int temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
        }
        System.out.println("The integers between "+firstNum+" and "+secondNum+" are: ");
        while(firstNum < secondNum-1){
            firstNum++;
            System.out.println(firstNum);
            
        }
    }
    
}
