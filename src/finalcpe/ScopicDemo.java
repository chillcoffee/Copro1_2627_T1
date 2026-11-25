
package finalcpe;

public class ScopicDemo {
    public static void main(String[] args) {
        String input = "microscopic";
        char letters[] = input.toCharArray();
        byte b[] = new byte[input.length()];
        String expected = "scopic";
        int startIndex = 0;
        for(int i=0; i < letters.length; i++){
            b[i] = (byte) letters[i];
            System.out.print(b[i]+" ");
            if(letters[i] == expected.charAt(0))
                startIndex = i;
        }
        String output = new String(b, startIndex, expected.length());
        System.out.println("\n"+output.toUpperCase());        
        
    }
    
}
