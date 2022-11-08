import java.util.*;
public class SimpleLinkedList_Revs_And_Sorted_ComparatorV4
{
    
    static int size(integer head){
        int count=0;
        integer tmp = head;
        if(tmp==null)return count;
        else{
            while(tmp!=null){
                count++;
                tmp = tmp.next;
            }
            return count;
        }
    }
    static integer addAfter(integer head , int n, int datatoafter){
        integer tmp = head;
        while(tmp!=null&&tmp.data!=datatoafter){
            tmp = tmp.next;
        }
        if(tmp==null){
            //System.out.print("Element not found");
            return head;
        }
        integer newnode = new integer(n);
        if(tmp.next==null){
            tmp.next=newnode;
            return head;
        }
        
        newnode.next = tmp.next;
        tmp.next=newnode;
        return head;
        
        
    }
    static integer printRevs(integer head){
        if(head==null)return head;
        
        integer cur = head;
        integer prev=null;
        integer next=cur.next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    
    static int findMid(integer head){
        int size = size(head);
        if(size>=3){
            integer tmp=head;
            int mid=size/2;
            int count=1;
            while(count<mid){
                tmp = tmp.next;
                count++;
            }
            return tmp.data;
        }else
        return 0;
    }
    static integer addFirst(integer head , int n){

        integer newnode = new integer(n);
        if(head==null){
            head=newnode;
            return head;
        }
        newnode.next=head;
        head=newnode;
        return head;
    }
    static void printList(integer head){
        integer tmp = head;
        if(tmp==null)
        System.out.print("List is Empty!");
        //System.out.println("data in first Node "+ head.data);
        while(tmp!=null){
        System.out.print(tmp.data+"->");
              tmp=tmp.next;

        }
         System.out.println(tmp);
    }
    static integer add(integer head,int n){
        integer tmp = head;
        integer newnode = new integer(n);
        if(tmp!=null){
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next=newnode;
            return head;
        } 
        head=newnode;
        return head;
    }
    
	public static void main(String[] args) {
	    integer head = null;
	    integer fnode = new integer(10);
	    head = fnode;
	    integer snode = new integer(20);
	    fnode.next=snode;
	    if(head!=null)
	   // System.out.println(((Object)head).getClass().getSimpleName() );
	   // System.out.println("Address of fnode-> "+fnode );
    //     System.out.println("Data in fnode-> "+fnode.data );
    //     System.out.println("address of next node in fnode-> "+fnode.next );
	   // System.out.println("address of snode node-> "+snode );
	    head = add(head,30); //**1.add 2.addFirst 3.addAfter 4.size
	    head = addFirst(head,5);
	    head = add(head,40);
	    head = add(head,50);
	    head = addFirst(head,4);
	    head = add(head,60);
	    head = addAfter(head,25,60);
	    head = add(head ,1000);
	    head = addFirst(head,3);
	    head = addAfter(head,2000,1000);
	    
	    System.out.println("Size of List-> "+size(head));
        printList(head);
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        for(int i =0; i<arr.length;i++){
            head = add(head,arr[i]);
        }
        System.out.println(findMid(head));
        
         printList(head);
         head = printRevs(head);
         printList(head);
         head = printRevs(head);
         System.out.println("Size of List-> "+size(head));
         System.out.println("middle node is "+findMid(head));
         System.out.println("head node data-> "+head.data );
         printList(head);
         
         integer[] arr1 = new integer[size(head)];
         integer temp = head;
         for(int i = 0; i< size(head);i++){
             arr1[i]=temp;
             temp=temp.next;
         }
         System.out.println("Array length "+arr1.length);
         Arrays.sort(arr1,new SortUsingComparator());
             for(integer ele:arr1){
             System.out.print(ele.data+" ");
         }
         
         
	}
}

class integer{
    int data;
    integer next;
    
    integer(int n){
        data=n;
        next=null;
    }
}
class SortUsingComparator implements Comparator<integer>{
    public int compare(integer p1,integer p2 ){
        return p2.data - p1.data;
    }
}

