import java.*;
import java.util.*;

public class LongestCommomPrefix {
    public static String findPrefix(String[] strarr){
        if(strarr == null || strarr.length == 0){
            return "";
        }
        for(int i=0;i<strarr[0].length();i++){
            char c = strarr[0].charAt(i);
            for(int j=1;j<strarr.length;j++){
                if(i==strarr[j].length() || strarr[j].charAt(i)!=c){
                    return strarr[0].substring(0,i);
                }
            }
        }
        return strarr[0];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Strings: ");
        String[] strarr = sc.nextLine().split(" ");
        //for(int i = 0;i<strarr.length;i++){
        //    System.out.print(strarr[i] + " ");
        //}
        System.out.print(findPrefix(strarr));
    }    
}
