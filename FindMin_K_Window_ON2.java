import java.util.*;
 //O(n^2) // using two loops//i<=n-K-------j=i;j<=i+K
public class FindMin_K_Window_ON2
{
   
	public static void main(String[] args) {
		int arr[] = new int[]{5,4,3,4,1,2};
		int n = arr.length;
		int k = 3;
		for(int i=0;i<=n-k;i++){
		    int min = Integer.MAX_VALUE;
		    for(int j=i;j<i+k;j++){
		        
		        if(arr[j]<min)
		        min = arr[j];
		    }
		    System.out.print(min+" ");
		}
		
	    
	}
}