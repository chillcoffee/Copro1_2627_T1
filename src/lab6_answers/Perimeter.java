
package lab6_answers;

import java.util.Scanner;


public class Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter shape:");
        String shape = scanner.nextLine().toLowerCase();
        int perimeter = 0;
        
        switch(shape){
            case "triangle", "Triangle":
                System.out.println("Enter 3 dimensions: ");            
                int s1 = scanner.nextInt();
                int s2 = scanner.nextInt();
                int s3 = scanner.nextInt();
                perimeter = s1 + s2 + s3;
                break;                
            case "square":
                System.out.println("Enter length of the side: ");
                int side = scanner.nextInt();
                perimeter = side * 4;
                break;
            case "rectangle":
                System.out.println("Enter length: ");
                int len = scanner.nextInt();
                System.out.println("Enter width: ");
                int width = scanner.nextInt();
                perimeter = len * 2 + width * 2;
                break;
            default:
                System.out.println("Invalid shape.");
        }
        
        
        
        
        
        
//        if(shape.equalsIgnoreCase("triangle")){
//            System.out.println("Enter 3 dimensions: ");            
//            int s1 = scanner.nextInt();            
//            int s2 = scanner.nextInt();            
//            int s3 = scanner.nextInt();
//            perimeter = s1 + s2 +s3;            
//        }else if(shape.equals("square")){
//            
//        }
        if(perimeter !=0)
            System.out.println("Perimeter: "+perimeter);
    }
    
}
