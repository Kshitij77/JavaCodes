import java.util.*;
import java.util.Scanner;

class revString{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev ="";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        sc.close();
    }
}

/*
class revString{
    public static void main(String args[]) {
        String str = "Kshitij Jaiswal";
        StringBuffer rev = new StringBuffer(str);
        System.out.println(rev.reverse());
    }
}
*/