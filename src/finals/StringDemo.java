
package finals;

public class StringDemo {
    
    //constructor = special method with the same name as your classname without returntype
    //used to create new objects
    public StringDemo(){
        
    }
    
    public static void main(String[] args) {
        String name = new String("Leah"); //instantiation
        System.out.println(name);
        
        int grade[] = {85, 94, 78}; //array
        char chars[] = {'p', 'e', 'a','c','e','f','u','l'};
        
        
        String s = new String(chars, 2, 3);
        System.out.println(s);
//        for(int i=0; i<grade.length; i++)
//            System.out.println(chars[i]);
        
    }
    //methods
    public static int add(int n1, int n2){
        return 0;
    }
    
}
