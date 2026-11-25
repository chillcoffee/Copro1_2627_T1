
package finalcpe;

public class Scopic {
    public static void main(String[] args) {
        String input = "microscopic";
        char chars[] = input.toCharArray();
        byte b[] = new byte[chars.length];
        int startIndex = 0;
        for(int i=0; i < chars.length; i++){
            b[i] = (byte) chars[i];
            if(chars[i] == 's')
                startIndex = i;
        }
        String expected = "scopic";
        String output = new String(b, startIndex ,expected.length());
        System.out.println(output.toUpperCase());
    }
    
}
