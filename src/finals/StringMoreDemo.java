
package finals;


public class StringMoreDemo {
    public static void main(String[] args) {
        String name = new String("Leah Santos");
        int grade = 34;
        
        char letter = name.charAt(0);
//        System.out.println(letter);
//        System.out.println(name.toLowerCase());
//        System.out.println(name.length());
        char letters[] = name.toCharArray();
        
        for(int i=0; i<letters.length; i++){
            System.out.print(letters[i] +" ");
        }
        
        
        
        String firstName = new String(letters,5, 5);
        System.out.println("\n\nOUTPUT:");
        System.out.println(firstName.toUpperCase());
        
        //1 String name = "______";
        //2 Strin ____ = new String("_____");
        //3 contructor using char array
        //4 char array using startIndex, count
        //String ____ = new String(___,_,_);
        //5 using byte array
        //6 using byte array with startIndex, count
        
    }
    
}
