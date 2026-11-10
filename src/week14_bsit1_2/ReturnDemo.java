package week14_bsit1_2;

public class ReturnDemo {

    public static void main(String[] args) {
        System.out.println(add(5, 5));
        display();
        System.out.println(add(5, 15));
    }

    public static int display() {
        System.out.println("Hurray");
        System.out.println("Hurray");
        System.out.println("Hurray");
        return 100;
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

}
