
package finalcpe;


public class StringDemo {
    
    public StringDemo(){
        //constructor = special method without return type
        //constructor name is the same as the classname
    }
    
    /*
    1. String ____ = new String("_____");
    2. String ____ = new String(charArray, startIndex, count);
    */
    
    public static void main(String[] args) {
        char word[] = {'h','i','s','t','o','r','y'};
        String s = new String(word, 2, 5);
        System.out.println(s);
    }
    
}
