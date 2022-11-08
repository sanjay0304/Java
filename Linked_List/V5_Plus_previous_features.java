import java.util.*;
public class V5_Plus_previous_features
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
    static Node deleteLast(Node head){
	if(head==null || head.next==null)return null;
	Node tmp= head;
	Node prev=null;
	while(tmp.next!=null){
	prev=tmp;
	tmp=tmp.next;

}
prev.next=null;
return head;

}
//8699871029 lokpati
  static Node findNthNode()
   static Node deleteNode(Node head,int data){
	Node tmp =head;
	Node prev =null; next =tmp.next;
	while(tmp.next!=null && tmp.data!=data){
	tmp=
	prev=tmp;
	tmp=tmp.next;
		}
	if(tmp==null || tmp.next==null)return null;
	prev.next=tmp.next;
	
	
	if(tmp==null)retrun head;
	else{
	
	}


}
    static int findMid(integer head){
        int mid = size(head);
        integer tmp = head;
        if(tmp!=null || tmp.next!=null)	
            while(mid>0){
                tmp = tmp.next;
                mid--;	
            }
            return tmp.data;
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
    static integer addLast(integer head,int data){
        integer tmp = head;
        integer newnode = new integer(data);
        if(tmp==null){
            head=newnode;
            return head;
        }else{
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next=newnode;
        }
        return head;
        
    }
    static integer mergeLists(integer head1,integer head2){
        integer tmp1 = head1,tmp2=head2;
        
        integer head3=null;
        if(head1==null)
        return head2;
        else if(head2==null)
        return head1;
        
        if(tmp1.data<=tmp2.data){
            head3 = tmp1;
            tmp1=tmp1.next;
        }else{
            head3=tmp2;
            tmp2 =tmp2.next;
        }
        
        integer tmp3=head3;
        
        while(tmp1!=null && tmp2!=null){
            integer temp = null;
            if(tmp1.data<=tmp2.data){
                tmp3.next=tmp1;
                tmp3=tmp1;
                tmp1=tmp1.next;
            }else{
                tmp3.next=tmp2;
                tmp3=tmp2;
                tmp2 = tmp2.next;
            }
            // tmp3.next=temp;
            // tmp3=temp;
        }
        while(tmp1 != null){
            tmp3.next=tmp1;
            tmp3=tmp1;
            tmp1=tmp1.next;
        }
        while(tmp2 != null){
            tmp3.next=tmp2;
            tmp3=tmp2;
            tmp2=tmp2.next;
        }
    //     if (tmp1 != null) {
    //         tmp3.next = tmp1;
    //     }else if(tmp3 != null) {
    //         tmp3.next = tmp2;
    // }

    return head3; 
        
    }
        static boolean palindromeOrNot(integer head){
        Stack<Integer> st = new Stack <Integer>();
        integer tmp = head;
        while(tmp!=null){
            st.push(tmp.data);
            tmp=tmp.next;
        }
        System.out.println(st.peek());
        tmp =head;
        while(tmp!=null && !st.isEmpty())
            if(st.peek()!=tmp.data){
                return false;
            }else{
            st.pop();
            tmp=tmp.next;
        }
        return true;
    } 
   	public static void main(String[] args) {
	    integer head = null;
	    integer head2 = null;
	    integer head3 = null;
	    
	    
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
	    //head = addAfter(head,25,60);
	    head = add(head ,1000);
	    head = addFirst(head,3);
	    head = addAfter(head,2000,1000);
	    head = addLast(head,3000);
	    head = addAfter(head,4000,3000);
	    //head = deleteFirst(head);
	    System.out.println("Size of List-> "+size(head));
        printList(head);
        int[] arr = new int[]{1,2,3,4,4,3,2,1};
        for(int i =0; i<arr.length;i++){
            head2 = add(head2,arr[i]);
        }
	System.out.println(palindromeOrNot(head2));
        System.out.println("Second LinkedList printing....");
        printList(head2);
        
        // for(int i =0; i<arr.length;i++){
        //     head = add(head,arr[i]);
        // }
        
        
        System.out.println("Middle Node Data-> "+findMid(head));
        
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
         Arrays.sort(arr1,new SortInteger());
             for(integer ele:arr1){
             System.out.print(ele.data+" ");
         }
          System.out.println();
         
         head3 = mergeLists(head,head2);
         System.out.println("Printing merged lists....");
         printList(head3);
         
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
class SortInteger implements Comparator<integer>{
    public int compare(integer p1,integer p2 ){
        return p1.data - p2.data;
    }
}

