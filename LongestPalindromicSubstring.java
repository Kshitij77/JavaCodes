import java.*;
import java.util.*;

public class LongestPalindromicSubstring {
    public static boolean checkPalindrome(String str){
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        if(str.contains(rev)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int longest = 0;
        String ans = "";
        for(int i = 0; i<str.length()-1;i++){
            for(int j = i+1;j<str.length();j++){
                String substr = str.substring(i,j+1);
                if(checkPalindrome(substr)){
                    int len = substr.length();
                    if(len > longest){
                        longest = len;
                        ans = substr;
                    }
                }
            }
        }
        System.out.print(ans + " -> length: " + longest);
    }
}
