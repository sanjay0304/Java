import java.util.*;
public class LongestConsecutiveCount
{
    static int longestCount(int[] arr){
        HashSet<Integer> hash = new HashSet<Integer>();
        int n = arr.length;
        int count=1,max=1;
        for(int i=0;i<n;i++){
            hash.add(arr[i]);
        }
        for(int i=0;i<n;i++){
	int temp= arr[i];
            if(hash.contains(temp-1)==false){
                count=1;
            
            while(hash.contains(temp+1)){
                count+=1;
	temp++;
             }
	 if(count>max)
                max=count;
            }
        }
        return max;
        
    }
	public static void main(String[] args) {
	int[] arr = new int[]{3,1,6,8,9,5,2};
	System.out.print(" "+longestCount(arr));
	}
}