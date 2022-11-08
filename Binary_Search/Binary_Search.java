//Implement Binary search *****Array should be SORTED********
import java.util.*;
public class Binary_Search
{
    static int search(int[] arr,int target){
        int e = arr.length-1;
        int s=0;
        while(s<=e){
           int mid = s + ((e - s) / 2);
            
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                e = mid-1;
            }else if(target>arr[mid]){
                s=mid+1;
            }
        }
        return -1;
    } 
	public static void main(String[] args) {
	    
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100,150,200,300,400,500,600,700,800,900,950,1000};
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int result = search(arr,target);
		if(result!= -1)
		System.out.print("Element found at index "+ result);
		else
		System.out.print("Not found");
	}
}
