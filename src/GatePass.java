
import java.util.Scanner;

public class GatePass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter my name: ");
        String myName = scanner.nextLine();
        System.out.print("Enter your name: ");
        String yourName = scanner.nextLine();
        String ourNames = myName + yourName;
        System.out.println("Combined names: "+ourNames);
    }
}
