import java.util.*;
import java.*;

public class RemoveDuplicatesArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        String[] array = sc.nextLine().split(" ");
        int len = array.length;
        int[] nums = new int[len];
        for(int i=0;i<len;i++){
            nums[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(nums);
        int[] unique = new int[len];
        int j = 0;
        for(int i = 0;i<len-1;i++){
            if(nums[i]!=nums[i+1]){
                unique[j++] = nums[i];
            }
        }
        unique[j++] = nums[len-1];
        for(int i = 0;i<j;i++){
            nums[i] = unique[i];
        }
        System.out.print("\nUnique Array: ");
        for(int i = 0;i<unique.length;i++){
            System.out.print(unique[i] + " ");
        }
        System.out.print("\nUnique Count is: " + j);
    }    
}
