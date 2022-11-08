
public class SimpleLinkedList
{
    static Node addFirst(Node head,int n,String str){
        Node newnode = new Node(n,str);
       
        if (head==null){
            
            head=newnode;
            return head;
        }else{
            newnode.next=head;
            head=newnode;
            return head;
            
        }
    }
    static Node addAfter(Node head, int n, String str,int dataToSearch){
        Node newnode = new Node(n,str);
        Node temp = head;
        if(head==null){
            System.out.println("List is Empty adding as first node!");
            head=newnode;
            return head;
        }else{
            while(temp!=null){
                if(temp.roll==dataToSearch){
                    newnode.next=temp.next;
                    temp.next=newnode;
                     return head;   
                }else{
                     temp=temp.next;
                }
            }
           System.out.println("Element "+dataToSearch+" not found!");
           temp.next=newnode;
           return head;
        }
    }
    static void printLinkedList(Node head){
        System.out.println("Roll No"+"\t\t"+"Names");
         Node temp = head;
	  while(temp!=null){
	      System.out.println(temp.roll+"\t\t"+temp.name);
	      temp=temp.next;
	  }
    }
    static Node addNode(Node head,int n,String str){
        Node newnode= new Node(n,str);
        if(head==null){
            head=newnode;
            return head;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newnode;
        return head;
    }
    
    
	public static void main(String[] args) {
	    Node head = null;
	    head = addNode(head, 2000000,"Sanjay");
	    
	    
	    head=addFirst(head,80,"Ansh");//O(1)
	    
	    head=addNode(head,1000,"Avinash");
	    head=addNode(head,6000,"John");
	    head=addFirst(head,80,"Jonny");
	    head=addFirst(head,800,"Alexa");
	    head=addFirst(head,100,"Dada");
	    head = addNode(head, 1000000,"Sanjay");
	    //head = addAfter(head,1000000,"Sanjay");
	    head = addNode(head,25,"Magarita");
	    head = addAfter(head,777,"Linda",25);
	    
	    printLinkedList(head);
	    System.out.println("Data at head "+head.roll);
	}
}
class Node{
    int roll;
    String name;
    Node next;
    
    
    Node(int n, String name){
        this.name=name;
        roll=n;
        next=null;
        
    }
}