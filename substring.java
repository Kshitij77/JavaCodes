import java.*;
import java.util.*;

public class substring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        sc.close();
        char[] charstr = str.toCharArray();
        for (int start = 1; start <= str.length(); start++) {
            for (int i = 0; i <= str.length() - start; i++) {
                int ending = i + start - 1;
                for (int j = i; j <= ending; j++) {
                    System.out.print(charstr[j]);
                }
                System.out.println();
            }
        }
        /* Using Substring method
        for(int i = 0;i < str.length();i++){
            for(int j = i+1;j <= str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
        */
    }    
}
