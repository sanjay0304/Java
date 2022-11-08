import java.util.*;
public class LargestSubString
{
    static int LargestSubString(String str){
        HashSet<Character> hset = new HashSet<Character>();
        int max=0;
        for(int i = 0; i<str.length();i++){
            int j=i;
            int count=0;
            while(j<str.length() && !hset.contains(str.charAt(j) )){
                count++;
                hset.add(str.charAt(j));
                j++;
            }
                    hset.clear();
                        if(count>max)
                        max=count;
        }
        return max;
    }

	public static void main(String[] args) {
	    //String str="neetu";
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
		System.out.println(LargestSubString(str));
	}
}
