
public class SimpleLinkedListv2
{
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
    static integer printList(integer head){
        integer tmp = head;
        if(tmp==null)
        System.out.print("List is Empty!");
        //System.out.println("data in first Node "+ head.data);
        while(tmp!=null){
        System.out.print(tmp.data+"->");
              tmp=tmp.next;

        }
         System.out.print(tmp);
        return head;
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
	    System.out.println(((Object)head).getClass().getSimpleName() );
	    System.out.println("Address of fnode-> "+fnode );
        System.out.println("Data in fnode-> "+fnode.data );
        System.out.println("address of next node in fnode-> "+fnode.next );
	    System.out.println("address of snode node-> "+snode );
	    head = add(head,30);
	    head = addFirst(head,5);
	    head = add(head,40);
	    head = add(head,50);
	    head = addFirst(head,4);
	    head = add(head,60);
	    head = addAfter(head,25,60);
        head = printList(head);System.out.println();
        System.out.println("head node data-> "+head.data );
	    
	    
	    

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