import java.*;
import java.util.*;

//order of bracket close is also importnt
public class ValidParenthesis {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Parenthesis: ");
        String str = sc.nextLine();
        sc.close();
        if(str.length()==0){
            System.out.println("Empty String.");
            System.exit(0);
        }
        HashMap<Character, Character> maps = new HashMap<Character, Character>();
        maps.put('(',')');
        maps.put('{', '}');
        maps.put('[', ']');
        Stack<Character> sequence = new Stack<Character>();
        for(int i = 0;i<str.length();i++){
            Character current = str.charAt(i);
            if(maps.keySet().contains(current)){
                sequence.push(current);
            }
            else if(maps.values().contains(current)){
                if(!sequence.empty() && maps.get(sequence.peek())==current){
                    sequence.pop();
                }
                else{
                    System.out.println("false");  // if input only ] (closing brackets)
                    System.exit(0);
                }
            }
        }
        if(sequence.empty()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
