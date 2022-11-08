/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main

{
    static void printReverse(String str){
        Stack <Character> st = new Stack<Character> ();
        for(int i =0;i<str.length();i++){
             st.push(str.charAt(i));
        }
        while( !st.isEmpty()){
            System.out.print(st.pop());
        }
        
       
    }
    static Node add(Node head, int data){
        Node newnode = new Node(data);
        if(head==null){
            head =newnode;
        }else{
            Node tmp = head;
            while(tmp.next!=null){
            tmp=tmp.next;
            }
            tmp.next=newnode;
        }
        
        return head;
        
    }
    
    static Node reverseList(Node head){
        if (head == null||head.next==null) return head;
        Node tmp = head;
        Node cur =head;
        Node prev =null;
        Node next =cur.next;
        while(cur!=null){
            next = cur.next;
            cur.next =prev;
            prev=cur;
            cur =next;
        }
        return prev;
        
        
    }
    static Node printList(Node head){
        if(head==null)return head;
        Node tmp = head;
        while(tmp!=null){
            System.out.print(tmp.n+"->");
            tmp=tmp.next;
        }
        System.out.println("null");
        return head;
        
    }
	public static void main(String[] args) {
// 	Node head =null;
// 	head = add(head,10);
// 	head = add(head,20);
// 	head = add(head,30);
// 	head = add(head,40);
// 	head = add(head,50);
// 	head = add(head,60);
// 	head = printList(head);
// 	head = reverseList(head);
//     head = printList(head);
//     printReverse("hello");
        int arr[] ={5,5,5,8,8,7,4,3,5,9,12,4};
    //     // Remove.bubbleSort(arr);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" "); 
    //     }
    //     System.out.println();
    //   int n= Remove.removeDuplicates(arr);
       for(int i = 1;i <=5;i++){
           for(int j =1;j <=5;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       
        for(int i = 1;i <=5;i++){
           for(int j =1;j <=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
        for(int i = 1;i <=5;i++){
           for(int j =1;j <=i;j++){
               System.out.print(j);
           }
           System.out.println();
       }
        for(int i = 1;i <=5;i++){
           for(int j =1;j <=5-i+1;j++){
               System.out.print("*");
           }
           System.out.println();
       }
        for(int i = 1;i <=5;i++){
           for(int j =1;j <=i;j++){
               System.out.print(j+" ");
           }
           System.out.println();
       }
        for(int i = 1;i <=5;i++){
           for(int j =1;j <=5;j++){
               if(j<=5-i)
               System.out.print(" ");
               else
               System.out.print("*");
           }
           
           System.out.println();
       }
       int n = 5;
        for(int i = 1;i <=2*n-1;i++){
           int totCol= i>n?2*n-i:i;int j =1;
           for(;j <= totCol;j++){
                  
                  System.out.print(j+" ");
            }     
              
             
           
            //  if(i>=2 && i<=8)
            //   System.out.print(1);
              
              System.out.println();
              
           }
          Remove.selectionSort(arr);
          for(int ele : arr)
          System.out.print(ele+" ");
	}
}


class Node{
    int n;
    Node next;
    
    Node(){}
    
    Node(int data){
        n=data;
        Node next = null;
    }
}
