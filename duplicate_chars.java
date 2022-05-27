import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;
public class duplicate_chars {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the word: "); 
    String str = sc.nextLine();
    HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
    for(int i = 0;i<str.length();i++){
        char c = str.charAt(i);
        if(charMap.containsKey(c)){
            charMap.put(c, charMap.get(c)+1);
        }
        else{
            charMap.put(c, 1);
        }
    }
    for(Character c: charMap.keySet()){
        if(charMap.get(c)>1){
            System.out.println("Character " + c + " ==> " + charMap.get(c));    
        }
    //    System.out.println("Character " + c + " ==> " + charMap.get(c));
    }
 }   
}
