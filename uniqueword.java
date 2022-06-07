import java.util.*;
import java.util.Scanner;
import java.util.HashSet;

class uniqueword {
    public static void main(String args[]){
        System.out.print(" Enter the word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        boolean correct = true;
        HashSet character = new HashSet<>();
        for(int i = 0;i<word.length();i++){
            char c = word.charAt(i);
            if(!character.add(c)){
                //Hashset returns false if duplicate value is added and overwrites the value.
                correct = false;
            }
        }
        if(correct){
            System.out.println(word + " have all unique chars");
        }
        else{
            System.out.println(word + " doesn't have all unique chars");
        } 
        System.out.print(character);
    }
}

