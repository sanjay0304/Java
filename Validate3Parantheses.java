import java.util.*;
public class Validate3Parantheses
{
    static boolean validateExp3Braces(String str){
        Stack<Character> st = new Stack<Character>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch=='{' || ch =='['){
                st.push(ch);
            }else{
                if(st.empty()){
                    return false;                    
                }else{
                    if(ch==')'&& st.peek()=='('){
                        st.pop();
                    }
                     if(ch=='}'&& st.peek()=='{'){
                        st.pop();
                    }
                     if(ch==']'&& st.peek()=='['){
                        st.pop();
                    }
                }
            }
        }
        if(st.empty())
            return true;
            else
            return false;
    }
	public static void main(String[] args) {
	   // String str="[{[()]}";
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	System.out.println((validateExp3Braces(str))?"Expression is Valid":"Expression Not Valid");
	}
}