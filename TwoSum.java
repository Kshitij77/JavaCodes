//Sum of indexes equal to target
import java.*;
import java.util.*;

public class TwoSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        String[] array = sc.nextLine().split(" ");
        System.out.print("Enter the Target Number: ");
        int target = sc.nextInt();
        int len = array.length;
        int[] nums = new int[len];
        for(int i=0;i<len;i++){
            nums[i] = Integer.parseInt(array[i]);
        }
        int[] index = new int[2];
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    index[0]=i;
                    index[1]=j;
                    break;
                }
            }
        }
        System.out.print("The indexes are: [" + index[0] + ", " + index[1] + "]");
    }
}
