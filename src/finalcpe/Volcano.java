
package finalcpe;

public class Volcano {
    public static void main(String[] args) {
        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        int startIndex = 0;
        char chars[] = word.toCharArray();
        
        for(int i=0; i < chars.length; i++){
            if(chars[i] == 'v'){
                startIndex = i;
            }
        }
        
        String expected = "volcano";
        int count = expected.length();
        String output = new String(chars, startIndex, count);
        System.out.println(output);
        
    }
    
}
