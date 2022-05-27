import java.*;
import java.util.*;

public class LinkedList {
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

    public void addBegin(int data){
        Node newNode = new Node(data);
        Node currentNode = head;
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            head = newNode;
            head.next = currentNode; 
        }
    }

    public void addAfter(int data,int index,int len){
        int i = 1;
        if(index>len){
            System.out.print("\nEnter valid index.");
        }
        Node newNode = new Node(data);
        Node currentNode = head;
        while(i<index){
            currentNode = currentNode.next;
            i++;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }
    
    public void delEnd(int len){
        if(head == null){
            System.out.println("Empty List.");
        }
        Node currentNode = head; 
        int i = 1;
        while(i<len-1){
            currentNode = currentNode.next;
            i++;
        }
        currentNode.next = null;
        tail = currentNode;
    }
    
    public void delBegin(){
        if(head == null){
            System.out.println("Empty List.");
        }
        head = head.next;
    }

    public void delThis(int index,int len){
        if(index>len){
            System.out.print("\nEnter valid index.");
        }
        int i = 1;
        Node currentNode = head;
        Node temp = null;
        while(i<index-1){
            currentNode = currentNode.next;
            i++;
        }
        temp = currentNode.next;
        currentNode.next = temp.next;
        temp.next = null;
    }

    public int length(){
        Node currentNode = head;
        int count = 0;
        while(currentNode!=null){
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public void rev(){
        if(head==null){
            System.out.print("\nEmpty List.");
        }
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
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

    public static void main(String args[]){
        LinkedList list1 = new LinkedList();
        list1.addBegin(10);
        list1.addEnd(5);
        list1.addEnd(45);
        list1.addBegin(20);
        list1.addBegin(0);
        list1.addEnd(10);
        list1.addBegin(100);
        System.out.print("\nOriginal List: ");
        list1.display();
        list1.addAfter(80, 2, list1.length());
        System.out.print("\nAfter Adding 80 at index 2: ");
        list1.display();
        list1.delBegin();
        list1.delEnd(list1.length());
        System.out.print("\nAfter deleting from begin and end: ");
        list1.display();
        list1.delThis(2, list1.length());
        System.out.print("\nAfter Deleting from index 2: ");
        list1.display();
        System.out.print("\nReversed List: ");
        list1.rev();
        list1.display();
        System.out.print("\nBubble Sort: ");
        list1.bubbleSort();
        list1.display();
        System.out.print("\nLength is: " + list1.length());
    }
}
