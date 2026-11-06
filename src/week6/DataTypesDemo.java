package week6;

public class DataTypesDemo {

    public static void main(String[] args) {
        long age = 32768L;
        double price = 35.67;
        String name = "Ruffa Resentes      ";
        char mi = 68;
        System.out.println("age: " + age);
        System.out.println("Name: " + name + " " + mi);
        System.out.println("Price: " + price);
        boolean result = 3 > 5;
        boolean flag = false;

        System.out.println(flag);
        char letter = name.charAt(4);
        System.out.println(letter);
        String words[] = name.split("R");
        int one = 1;
        System.out.println(name.trim());
        for (String w : words) {
            System.out.println(w);
        }

    }

}
