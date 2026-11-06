import java.util.*;
public class InputOutput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a whole number: ");       //prompt
        int num = scanner.nextInt(); scanner.nextLine();                        //scanning
        num += 3;
        System.out.println("The integer is "+num);
        
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello, "+name);
    }
}