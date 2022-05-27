import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

class anagrams {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine();
        System.out.print("Enter the check: ");
        String check = sc.nextLine();
        sc.close();
        char wordtemp[] = word.toCharArray();
        char checktemp[] = check.toCharArray();
        Arrays.sort(wordtemp);
        Arrays.sort(checktemp);
        String wordsort = String.valueOf(wordtemp);
        String checksort = String.valueOf(checktemp);
        //String wordsort = String(wordtemp);
        //String checksort = String(checktemp);
        if(wordsort.equals(checksort)){
            System.out.println(word + " and " + check + " are anagrams");    
        }
        else{
            System.out.println("Not Anagrams");
        }
        System.out.println("String Sorted word: " + wordsort);
        System.out.println("String Sorted check: " + checksort);
        //System.out.println("Char Sorted word: " + wordtemp);
        //System.out.println("Char Sorted check: " + checktemp);
    }
}
