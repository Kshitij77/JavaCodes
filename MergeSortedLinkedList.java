import java.*;
import java.util.*;

public class MergeSortedLinkedList {
    class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        
    public Node head = null;
    public Node tail = null;
    
    public void addEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public void bubbleSort(){
        if(head==null){
            System.out.print("\nEmpty List.");
        }
        Node current = head;
        int temp;
        Node next = null;
        while(current!=null){
            next = current.next;
            while(next!=null){
                if(current.data>next.data){
                    temp = current.data;
                    current.data = next.data;
                    next.data = temp;
                }
                next = next.next;
            }
            current = current.next;
        }
    }
    
    public void display(){
        Node currentNode = head; 
        if(head==null){
            System.out.print("Empty List.");
            return;
        }
        System.out.print("\nList is: ");
        while(currentNode!=null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;   
        }
    }
    
    public Node mergeTwoLists(Node head1, Node head2,int len1){
        if(head1 == null){
            return head1;
        }
        else if(head1==null && head2!=null){
            return head2;
        }
        else if(head1!=null && head2==null){
            return head1;
        }
        int i =1;
        Node current = head1;
        while(i<len1){
            current = current.next;
            i++;
        }
        current.next = head2;
        return head1;
    }

    public static void main(String args[]){
        MergeSortedLinkedList list1 = new MergeSortedLinkedList();
        MergeSortedLinkedList list2 = new MergeSortedLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of List1: ");
        String[] str1 = sc.nextLine().split(" ");
        int len1 = str1.length;
        int[] num1 = new int[len1];
        for(int i = 0;i<len1;i++){
            num1[i] = Integer.parseInt(str1[i]);
            list1.addEnd(num1[i]);
        }
        System.out.print("Enter the elements of List2: ");
        String[] str2 = sc.nextLine().split(" ");
        int len2 = str2.length;
        int[] num2 = new int[len2];
        for(int i = 0;i<len2;i++){
            num2[i] = Integer.parseInt(str2[i]);
            list2.addEnd(num2[i]);
        }
        sc.close();
        System.out.print("List1: ");
        list1.display();
        System.out.print("\nList2: ");
        list2.display();
        System.out.print("\nSorted List1: ");
        list1.bubbleSort();
        list1.display();
        System.out.print("\nSorted List2: ");
        list2.bubbleSort();
        list2.display();
        list1.head = list1.mergeTwoLists(list1.head,list2.head,len1);
        System.out.print("\nMerged List: ");
        list1.display();
        System.out.print("\nSorted Sorted MergedList: ");
        list1.bubbleSort();
        list1.display();
    }    
}
