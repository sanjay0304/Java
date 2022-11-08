import java.util.*;

public class Deque
{
	public static void main(String[] args) {
	   // deque<Integer> dq = new deque<Integer>();
	   // dq.add(10);
	   DQue dq = new DQue();
	   dq.addFirst(20);
	   dq.addFirst(10);
	   dq.peekFirst();
	    dq.peek();
	    dq.add(30);
dq.add(40);
dq.peekLast();
dq.size();	
Iterator it = dq.iterator();
while(it.hasNext()){
System.out.print(it.next()+" ");
}
	}
}
class DQue{
static int length; 
     ArrayList<Integer> q =new ArrayList<Integer>();
     
     void add(int n){
         q.add(n);
     } 
    void addFirst(int n){
        q.add(0,n);
    } 
    int peekFirst(){
        if(q.size()==0){
            System.out.println("Deque is Empty");
            return 0;
        }else{
        System.out.println("front element is = "+q.get(0));
        return q.get(0);
        }
    }
 int peek(){
        if(q.size()==0){
            System.out.println("Deque is Empty");
            return 0;
        }else{
        System.out.println("front element is = "+q.get(0));
        return q.get(0);
        }
    }int peekLast(){
        if(q.size()==0){
            System.out.println("Deque is Empty");
            return 0;
        }else{
        System.out.println("Last element is = "+q.get(q.size()-1));
        return q.get(q.size()-1);
        }
    }
int size(){
System.out.print("Size of Deque "+q.size());
return q.size();
}	
        
    
}