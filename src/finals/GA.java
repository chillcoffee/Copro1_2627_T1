
package finals;

public class GA {
    public static void main(String[] args) {
        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        char letters[] = word.toCharArray();
        int startIndex = 0;
        for(int i=0; i< letters.length; i++){
            if(letters[i] == 'v'){
                startIndex = i;
                break;
            }
        }
        String expected = "volcano";
        int count = expected.length();
        String output = new String(letters, startIndex, count);
        System.out.println(output);
    }
    
}
