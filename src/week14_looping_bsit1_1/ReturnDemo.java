
package week14_looping_bsit1_1;

public class ReturnDemo {
    public static void main(String[] args) {
        System.out.println(add(5, 5));
        System.out.println(add(5, 15));
    }
    
    public static int display(){
        System.out.println("Hurray");
        System.out.println("Hurray");
        System.out.println("Hurray");  
        return 0;
    }
    
    public static int  add(int n1, int n2){
        System.out.println("Addition");
        return n1 + n2;
    }
    
}
