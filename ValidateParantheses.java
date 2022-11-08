import java.util.*;
//import java.util.IO.*;
public class ValidateParantheses
{
    static Boolean validate(String str){
        Stack <Character> st = new Stack <Character> ();
		
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)==')'){
		        if(st.empty())
		        return false;
		        else
		          st.pop();  
		    }
		    else 
	            st.push(str.charAt(i));
		        
		    }
		    if(st.empty())
		    return true;
		    else
		    return false;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		//String str ="()()()((())))()()((()))";
		        System.out.print(validate(str));
		        
		    }
		}