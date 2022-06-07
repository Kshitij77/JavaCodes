import java.*;
import java.util.*;

public class MedianSortedArray {
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the First Array: ");
        String[] a1 = sc.nextLine().split(" ");
        int l1 = a1.length;
        int[] arr1 = new int[l1];
        for(int i = 0;i<l1;i++){
            arr1[i] = Integer.parseInt(a1[i]);
        } 
        System.out.println("Enter the Second Array: ");
        String[] a2 = sc.nextLine().split(" ");
        int l2 = a2.length;
        int[] arr2 = new int[l2];
        for(int i = 0;i<l2;i++){
            arr2[i] = Integer.parseInt(a2[i]);
        }
        sc.close();
        int l3 = l1+l2;
        int[] arr3 = new int[l3];
        System.arraycopy(arr1, 0, arr3, 0, l1);
        System.arraycopy(arr2, 0, arr3, l1, l2);
        System.out.println("The First Array: ");
        for(int i = 0;i<l1;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nThe Second Array: ");
        for(int i = 0;i<l2;i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\nThe Merged Array: ");
        for(int i = 0;i<l3;i++){
            System.out.print(arr3[i] + " ");
        }
        Arrays.sort(arr3);
        System.out.println("\nThe Sorted Merged Array: ");
        for(int i = 0;i<l3;i++){
            System.out.print(arr3[i] + " ");
        }
        double median;
        if(l3%2 != 0){
            median = arr3[l3 / 2];
        }
        else{
            median = (arr3[(l3-1) / 2] + arr3[l3 / 2]) / 2.0;
        }
        System.out.println("\nThe Median is: " + median);
    }
}
