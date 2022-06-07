import java.*;
import java.util.*;

public class lastWord {
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the String: ");
      String str = sc.nextLine();
      sc.close();
      /*String[] parts = str.split(" ");
      int j = 0;
      int k = 0;
      System.out.print("\nBefore removing Space:\n");
      for(int i = 0;i<parts.length;i++){
        System.out.println("index: " + i + " value: " + parts[i]);
      }
      for(int i = 0;i<parts.length;i++){
        if(!parts[i].isBlank()){
            j++;
        }
      }
      String[] words = new String[j];
      for(int i = 0;i<parts.length;i++){
        if(!parts[i].isBlank()){
            words[k++] = parts[i];
        }
      }
      System.out.print("\nAfter removing Space:\n");
      for(int i = 0;i<j;i++){
        System.out.println("index: " + i + " value: " + words[i]);
      }
      System.out.print("\nLast Word is: " + words[j-1]); */
      //The above code is also correct but below one is optimized an short just searching for a blank space from back of the string
      
      String rev = "";
      for(int i = str.length()-1;i>=0;i--){
        if(!rev.isBlank() && str.charAt(i) == ' ') //applying isBlank as if in string the last charcter is a blankspace so we have to take it for now until a character comes in rev.
        {
          break;
        }
        rev = rev + str.charAt(i);
      }
      //We got last word but its in rev order so reversring the rev string to get our word
      String ans = "";
      for(int i = rev.length()-1;i>=0;i--){
        ans = ans + rev.charAt(i);
      }
      ans = ans.replaceAll("\\s", ""); //to remove the spaces from last
      System.out.print("Last Word is: " + ans);
      System.out.print("\nLength of Last Word is: " + ans.length());
    }
    //1st sol has better runtime see on leetcode length of last word problem  
}
