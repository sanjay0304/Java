//Q. print the sum of all the +ve integers from an array A={12,34,-20,44,-10,56,-2,86,12}.

/*Q. print the sum of only the first 3 positive no's from the any array.
example:
1)input A={12,34,-20,44,-10,56,-2,86,12}, 
ans: 12+34+44=90.
2)input A={-2,-5,-10,-91,-23,12,34,-20,44,-10,56,-2,86,12} 
ans:12+34+44=90.
1.Given an unsorted of distinct integers, find the largest pair sum in it. For example,
the largest pair sum in {12, 34, 10, 6, 40} is 74 in O(N) time-complexity.
*/

public class PositiveNumSum{
    static int findSumPositiveNo(int arr[]){
        int n=arr.length;
        int sum =0;
        int cnt=0;
        for(int i = 0;i<n; i++){
            if(arr[i]>0 && cnt<3){
            sum+=arr[i];
            cnt++;
            }
        }
        return sum;
        
    }
    static int LargestSumPair(int arr[]){
        int n = arr.length, maxindx=-1, maxele1=Integer.MIN_VALUE;
        int sumpair=0;
        for(int i =0;i<n;i++){
            if(arr[i]>maxele1){
             maxele1=arr[i];
             maxindx=i;
            }
        }
        int maxele2 =Integer.MIN_VALUE;
        for(int i =0 ; i <n;i++){
            if(arr[i]>maxele2 && i!=maxindx){
                maxele2=arr[i];
            }
        }
        //Arrays.sort(arr);
        sumpair = maxele1+maxele2;
        return sumpair;
    }
    
    
    
    
    
    
    
   
}