import java.*;
import java.util.*;

public class lastWord {
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the String: ");
      String str = sc.nextLine();
      sc.close();
      String[] parts = str.split(" ");
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
      System.out.print("\nLast Word is: " + words[j-1]);
    }  
}
