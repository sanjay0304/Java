
public class CircularLinkListImplementation
{
    // static boolean duplicateOrNot(Node head){
       
    //     if(head==null)return head;
    //     HashSet<Integer> hs = new HashSet<Integer>();
    //     Node tmp=head;
    //     while(tmp!=null){
    //         if(hs.contains(tmp.data))
    //         return true;
    //         else
    //         hs.add(tmp.data);
    //         tmp=tmp.next;
    //     }
    //     return false;
        
    // }
    static Node addFirstNodeC(Node Last,int data){
        if(Last!=null)
        return Last;
        
        Node newnode = new Node(data);
        
        if(Last==null){
            Last=newnode;
            newnode.next=newnode;
        }
        // while(Last.next!=Last)
        // Last=Last.next;
        
        
        return Last;
        
        
        
    }
    static Node addFrontC(Node Last ,int data){
       
        if(Last ==null){
        return addFirstNodeC(Last,data);
        }
       
        Node newnode= new Node(data);
        newnode.next=Last.next;
        Last.next=newnode;
        
        return Last;
    }
    static Node addLastC(Node Last,int n){
        if(Last ==null)
        return addFirstNodeC(Last,n);
        Node newnode = new Node(n);
        newnode.next=Last.next;
        Last.next=newnode;
        Last=newnode;
        
        return Last;
    }
    static void printListC(Node Last){
        if(Last==null){
            System.out.println("Empty List...");
            return;
            }
            Node tmp = Last.next;
            do{
                System.out.print(tmp.data+"->");
                 tmp=tmp.next;
            }while(tmp!=Last.next);
    }
    
	public static void main(String[] args) {
 		
        Node last = null;
        last = addFirstNodeC(last,50);
        // last = addFrontC(last,40);
        // last = addLastC(last,60);
        System.out.println("last node address " +last);
        System.out.println("next node of last " +last.next);
        System.out.println("last node data " +last.data);
        printListC(last);
	}
}
class Node{
    int data;
    Node next;
    Node(int n){
        this.data=n;
        this.next=null;
    }
}