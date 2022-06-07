//Almost similar to Two Sum problem but code will be different as here array is sorted and yime limit exceeding 18/21 passes.
//The below code paases all 21 cases but still was time limit exceeded.
/*int[] index = new int[2];
        outerloop:
        for(int i = nums.length-1;i>0;i--){
            for(int j = i-1;j>=0;j--){
                System.out.println("i: " + i + " ");
                System.out.println("j: " + j + " ");
                if(nums[i]+nums[j] == target){
                    index[0]=j+1;
                    index[1]=i+1;
                    break outerloop;
                }
            }
        } */
import java.util.*;

public class TwoSumII__SortedArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array: ");
        String[] array = sc.nextLine().split(" ");
        System.out.print("Enter the Target Number: ");
        int target = sc.nextInt();
        int len = array.length;
        int[] nums = new int[len];
        for(int i=0;i<len;i++){
            nums[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(nums);
        int[] index = new int[2];
        int start = 0;
        int end = nums.length-1;
        for(int i = 0;i<nums.length;i++){
            if(nums[start] + nums[end] == target){
                index[0] = start+1;
                index[1] = end+1;
                break;
            }
            else if(nums[start] + nums[end] > target){
                end--;
            }
            else{
                start++;
            }
        }
        System.out.print("The indexes are: [" + index[0] + ", " + index[1] + "]");
    }
}
