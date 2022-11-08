import java.util.*;
public class PalindromeRecursion
{
    static String PrntRevrsAndPalindrome(String str,int i,String str2){
        
        if(i<0)
        return str2;
        
          str2+=str.charAt(i);
          return PrntRevrsAndPalindrome(str,i-1,str2);
            
        
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	String str2 = PrntRevrsAndPalindrome(str,str.length()-1,"");
	if(str.compareTo(str2)==0)
	System.out.print(str +" is Palindrome");
	else
	System.out.print(str +" is not Palindrome");
	}
}