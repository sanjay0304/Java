import java.util.*;
//FIND MAX NO. IN AN ARRAY
public class Max
{
    static int arr[] = new int[]{55,44,22,12,1,3,7,89,58,64,47};
	public static void main(String[] args) {
	    System.out.print("Length of the array:"+arr.length+"\n");
	    int max = Integer.MIN_VALUE;
	    System.out.print(max+"\n");
		for(int x:arr){
    		if(x>max){
    		    max=x;
    		}
		}
		System.out.print("max value: "+max);
	}
	
}