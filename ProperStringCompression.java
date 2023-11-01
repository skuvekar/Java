import java.util.*;
/* Question: Consider a string, S, that is a series of characters, each followed by its 
frequency as an integer. The string is not compressed correctly, so there may be
multiple occurrences of the same character. A properly compressed string will consist 
of one instance of each character in alphabetical order followed by the total count of 
that character within the string.*/
public class ProperStringCompression{
    public static void main(String args []){
        String input = "a3b5c2a2";
        TreeMap<Character, Integer> tm = new TreeMap();
        for(int i=0; i<input.length(); i+=2){
            char c=input.charAt(i);
            int f=Integer.parseInt(String.valueOf(input.charAt(i+1)));
            tm.put(c, tm.getOrDefault(c,0)+f);
        }
        System.out.println(tm);
        String compressedString="";
        for(Map.Entry<Character, Integer> entry : tm.entrySet()){
            compressedString+=entry.getKey();
            compressedString+=entry.getValue();
        }
        System.out.println(compressedString);
        

    }    
}
