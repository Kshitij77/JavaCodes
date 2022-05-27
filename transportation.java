/* 
Problem Statement
The list of products 'p' with product count [5,4,6,3], and the selling price 's' associated with them is [10$, $40$, $30$, $50$].
And, the maximum number of products that can be transferred is 10.
The program should choose products like Product4 with the 3-product count Product2 with the 4-product count. then
As a result, the total number of products that can transport is 3+4 = 7, which is less than or equal to the limit of transport products.
Therefore, the maximum revenue earned will be $50+$40 = $90, the maximum possible with this input.
Sample Input
5,4,6,3
10,40,30,50 10
Sample Output
Maximum Revenue $90
Product2, Product4 can be transported.
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class transportation {
    static ArrayList<ArrayList<Integer> > combinationSum(ArrayList<Integer> prodlist, int limit) {
        ArrayList<ArrayList<Integer> > prods = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        //System.out.println(prodlist); 
        findNumbers(prods, prodlist, limit, 0, temp);
        return prods;
    }
    static void findNumbers(ArrayList<ArrayList<Integer> > prods, ArrayList<Integer> prodlist, int limit, int index, ArrayList<Integer> temp) {
        for (int i = index; i < prodlist.size(); i++) {
            //arr.remove(arr.get(i));
            if ((limit - prodlist.get(i)) >= 0) {
                //System.out.println(arr.get(i));
                temp.add(prodlist.get(i));
                //arr.remove(arr.get(i));
                findNumbers(prods, prodlist, limit - prodlist.get(i), i+1, temp);
                temp.remove(prodlist.get(i));
            }
        }
        prods.add(new ArrayList<>(temp));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Products: ");
        String[] array = sc.nextLine().split(" ");
        int prodsize = array.length;
        int[] product = new int[prodsize];
        if(prodsize<2){
            System.exit(0);
        }
        for(int i = 0;i<prodsize;i++){
            product[i] = Integer.parseInt(array[i]);
            //System.out.println(product[i]);
        }
        System.out.println("Enter Cost: ");
        String[] arr = sc.nextLine().split(" ");
        int costsize = arr.length;
        if(prodsize!=costsize){
            System.exit(0);
        }
        int[] cost = new int[costsize];
        for(int i = 0;i<costsize;i++){
            cost[i] = Integer.parseInt(arr[i]);
            //System.out.println(cost[i]);
        }
        System.out.println("Enter limit: ");
        int limit = sc.nextInt();
        sc.close();
        HashMap<Integer, Integer> prodcost = new HashMap<Integer, Integer>();
        for(int i = 0;i<prodsize;i++){
            prodcost.put(product[i], cost[i]);
        }
        /*for(Map.Entry m: prodcost.entrySet()){
        //    System.out.println(m.getKey() + "==>" + m.getValue());
        }*/
        //System.out.println(prodcost);
        //Arrays.sort(product);
        /*for(int i=0;i<prodsize;i++){
            System.out.println(product[i]);    
        }
        */
        //System.out.println(prodcost);
        ArrayList<Integer> prodlist = new ArrayList<>(prodsize);
        for(int i:product){
            prodlist.add(Integer.valueOf(i));
        }
        //System.out.println(prodlist);
        ArrayList<ArrayList<Integer> > prods = combinationSum(prodlist, limit);
        if (prods.size() == 0) {
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i < prods.size(); i++) {
            System.out.print("(");
            for (int j = 0; j < prods.get(i).size(); j++) {
                System.out.print(prods.get(i).get(j) + " ");
            }
            System.out.print(") ");
        }
        int[] sum = new int[prods.size()];
        for (int i = 0; i < prods.size(); i++) {
            for (int j = 0; j < prods.get(i).size(); j++) {
                int prodnum = prods.get(i).get(j);
                int costval = prodcost.get(prodnum);
                sum[i] = sum[i] + costval;
            }
        }
        System.out.print("\n");
        for (int i = 0; i < prods.size(); i++){
            System.out.print(sum[i] + " ");
        }
        int max = sum[0];
        int ind = 0;
        for(int i=1;i<sum.length;i++){
            if(sum[i]>max){
                max=sum[i];
                ind = i;
            }
        }
        System.out.print("\nMax revenue generated: "+ max);
        //System.out.print("\n"+ind);
        ArrayList<Integer> productnum = new ArrayList<Integer>();
        productnum = prods.get(ind);
        /*System.out.print("\n"+productnum);
        System.out.print("\nAnd the Products are: ");
        Below for loop will give the product name not the index
        for(int i:productnum){
            System.out.print(i+", ");
        }
        */
        System.out.print("\nAnd the Products are: ");
        for(int i:productnum){
            for(int k =0;k<prodsize;k++){
                if(product[k]==i){
                    System.out.print("Product" + (k+1) +", ");
                }
            }
            //int j = Arrays.binarySearch(product, i);
            //System.out.print(j+", ");
        }
    }    
}
