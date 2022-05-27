import java.*;
import java.util.*;

public class InteReverse {
    public static void main(String args[]){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        boolean isNegative = false;
        if(x<0){
            isNegative = true;
            x = -x;
        }
        long revnum = 0;
        while(x>0){
            revnum = revnum*10 + x%10;
            x /= 10;
        }
        if(revnum > Integer.MAX_VALUE){
            System.out.print("-1");  // -1 if revnum is out 32 bit unsingned range mentioned in question
            System.exit(0);    
        }
        int ans = (int)(isNegative?-revnum:revnum);
        System.out.print("Reversed number is: " + ans);
    } 
}
