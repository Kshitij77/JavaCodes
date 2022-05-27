import java.*;
import java.util.*;

public class Palindrome {

    public static boolean checkPalindrome(int x){
        String str = Integer.toString(x);
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)){
            return true;
        }
        return false;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = sc.nextInt();
        sc.close();
        System.out.println(checkPalindrome(x));
    }
}

