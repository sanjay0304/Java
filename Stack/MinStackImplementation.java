import java.util.*;
public class MinStackImplementation
{
    static Stack<Integer> st_ele = new Stack <Integer>();
    static Stack<Integer> st_min = new Stack <Integer>();
    
    static void peek(){
        if(st_ele.empty()){
            System.out.println("Stack is empty");
        }
        else
        {
         System.out.println("top element is "+st_ele.peek());   
            
        }
    }
    
    static void pop(){
        if(st_ele.empty()){
            System.out.println("Stack is empty");
        }
        else 
        {
            System.out.println("popped element is "+st_ele.pop());
            st_min.pop();
        }
    }
    
    static void push(int data){
        st_ele.push(data);
        if(st_min.empty()){
            st_min.push(data);
            return;
        }
        int top = st_min.peek();
        if(data< top){
            st_min.push(data);
        }
        else{
            st_min.push(top);
        }
    }
    static void getMinimum(){
        if(st_min.empty()){
            System.out.println("Stack is empty...");
            return;
        }
       System.out.println("minimum element is "+st_min.peek());
    }

	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(1);
		push(2);
		
		pop();
		getMinimum();
	}
}
