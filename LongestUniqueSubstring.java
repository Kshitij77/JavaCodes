import java.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int longest = 0, begin = 0;
        for(int i = 0;i<str.length();i++){
            Map<Character, Integer> charmap = new HashMap<Character, Integer>();
            for(int j = i; j < str.length(); j++){
                char c = str.charAt(j);
                if(!charmap.containsKey(c)){
                    charmap.put(c, 1);
                }
                else{
                    break;
                }
            }
            int size = charmap.size();
            if(size>longest){
                longest = size;
                begin = i;
            }
        }
        System.out.println("String: " + str.substring(begin, begin+longest));
        System.out.println("Length: " + longest);

        /* Map<Character, Integer> charmap = new HashMap<Character, Integer>();
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if(!charmap.containsKey(c)){
                    charmap.put(c, 1);
                }
                else{
                    break;
                }
            }
        for(Character key : charmap.keySet()){
            System.out.println(key + " =" + charmap.get(key));
        }
        System.out.println("Size: " + charmap.size()); */
    }   
}
