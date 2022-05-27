import java.util.Scanner;
public class String_Rotation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ennter the word: ");
        String check = sc.nextLine();
        System.out.print("Ennter the rotation: ");
        String rotation = sc.nextLine();
        sc.close();
        String str = check+check;
        if(str.contains(rotation)){
            System.out.println(check + " and " + rotation + " are rotation of each other");            
        }
        else{
            System.out.println(check + " and " + rotation + " are not rotation of each other");
        }
        System.out.println(str);
    }
}
