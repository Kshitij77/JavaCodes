import java.*;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String args[]) {
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println("The first non repeated character in " + str + " is: " + getnonrepeated(str));
    }
    public static Character getnonrepeated(String str){
        Map<Character, Integer> charmap = new LinkedHashMap<Character, Integer>();
        for(int i = 0;i<str.length();i++){
            Character c = str.charAt(i);
            if(!charmap.containsKey(c)){
                charmap.put(c, 1);
            }
            else{
                charmap.put(c, charmap.get(c)+1);
            }
        }
        for(Entry<Character, Integer> e : charmap.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return null;
    }
}
