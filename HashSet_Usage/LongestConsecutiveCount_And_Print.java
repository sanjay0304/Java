// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class LongestConsecutiveCount_And_Print
{
    static int FindLongestSubSequence(int[] arr){
        int n = arr.length;
        int index=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i< n; i++){
            set.add(arr[i]);
        }
        int max=Integer.MIN_VALUE, count = 1;
        for(int i = 0; i < n;i++){
            if(set.contains(arr[i]-1)==false){
                int temp=arr[i];
                count =1;
                while(set.contains(temp+1)){
                    count++;
                    temp++;
                }
                if(count>max){
                max = count;
                index=i;
                }
            } 
            
        }
        for(int i = arr[index];i < arr[index]+max; i++){
            System.out.print(i+" ");
        
        }
        System.out.println();
        return max;
    }
	public static void main(String[] args) {
		int[] arr = new int[]{5,6,10,3,4,9,2,1,12,14,16,21,22,23,24,26,27,25,20,19,7};
		
		System.out.print("longest consecutive count "+FindLongestSubSequence(arr));
		
	}
}
