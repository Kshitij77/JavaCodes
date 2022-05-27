import java.io.*;
import java.util.*;
 
public class Combinational_Sum {
 
    static ArrayList<ArrayList<Integer> >
    combinationSum(ArrayList<Integer> arr, int sum)
    {
        ArrayList<ArrayList<Integer> > ans
            = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
 
        // first do hashing since hashset does not always
        // sort
        //  removing the duplicates using HashSet and
        // Sorting the arrayList
 
        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        Collections.sort(arr);
        //System.out.println(arr); 
        findNumbers(ans, arr, sum, 0, temp);
        return ans;
    }
 
    static void
    findNumbers(ArrayList<ArrayList<Integer> > ans,
                ArrayList<Integer> arr, int sum, int index,
                ArrayList<Integer> temp)
    {
 
      /*  if (sum == 0) {
 
            // Adding deep copy of list to ans
            //System.out.println("arr"+arr);
            ans.add(new ArrayList<>(temp));
            return;
        }
 */
        for (int i = index; i < arr.size(); i++) {
 
            // checking that sum does not become negative
            //arr.remove(arr.get(i));
 
            if ((sum - arr.get(i)) >= 0) {
                //System.out.println(arr.get(i));
 
                // adding element which can contribute to
                // sum
 
                temp.add(arr.get(i));
                //arr.remove(arr.get(i));
                findNumbers(ans, arr, sum - arr.get(i), i+1,
                            temp);
 
                // removing element from list (backtracking)
                temp.remove(arr.get(i));
            }
        }
        ans.add(new ArrayList<>(temp));
    }
 
    // Driver Code
 
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
 
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
 
        int sum = 10;
 
        ArrayList<ArrayList<Integer> > ans
            = combinationSum(arr, sum);
 
        // If result is empty, then
        if (ans.size() == 0) {
            System.out.println("Empty");
            return;
        }
 
        // print all combinations stored in ans
 
        for (int i = 0; i < ans.size(); i++) {
 
            System.out.print("(");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print(") ");
        }
    }
}