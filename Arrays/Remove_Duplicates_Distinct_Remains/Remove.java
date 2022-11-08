import java.util.*;
class Remove{
    //5,7,4,3,5,9,12,4//
    static void selectionSort(int[] arr){
        int n = arr.length;int index = -1;
        for(int i = 0; i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    index =j;
                }
            }
            int tmp=arr[i];
            arr[i]=min;
            arr[index]=tmp;
            
        }
        
        
    }
    static int removeDuplicates(int []arr){    
        int n = arr.length;
        int j = 1;
        Arrays.sort(arr);
       for(int i = 0; i < n-1; i++){
                if(arr[i]!=arr[i+1]){
                  arr[j]=arr[i+1];
                  j++;
                }
                
        }
        return j;
        }
            
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0;j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    
}