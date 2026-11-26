
package finalcpe;

public class VolcanoDemo {
    public static void main(String[] args) {
        String input = "pneumonoultramicroscopicsilicovolcanoconiosis";
        char chars[] = input.toCharArray();
        int startIndex = 0;
        for(int i=0; i < chars.length; i++){
            if(chars[i] == 'v')
                startIndex = i;
        }
        String expected = "volcano";
        int count = expected.length();
        String output = new String(chars, startIndex, count);
        System.out.println(output);        
        //edited comment to show sample git manipulation
    }
    
}
