import java.util.*;

public class MergeSort

{
    static void sortedArr(int arr[],int s,int m,int e){
        int newArr[]= new int[e-s+1];
        int i = s, j=m+1, k=0;
        while(i<=m && j<=e){
            if(arr[i]<arr[j]){
                newArr[k]=arr[i];
                i++;
            }else{
                newArr[k]=arr[j];
                j++;
            }
            k++;
        } 
        while(i<=m){
            newArr[k]=arr[i];
            i++;k++;
        }
        while(j<=e){
            newArr[k]=arr[j];
            j++;k++;
        }
       k=0;
        for(i=s;i<=e;i++){
            arr[i]=newArr[k];
            k++;
        }
        
    }
    static void mergeSort(int a[],int s,int e){
        
        if(s<e){
            int mid=(s+e)/2;
            mergeSort(a,s,mid);
            mergeSort(a,mid+1,e);
            sortedArr(a,s,mid,e);
        }
        
    }
    
	public static void main(String[] args) {
		int a[]={1,5,6,2,8,4,3,7};
		mergeSort(a,0,a.length-1);
		
		for(int x:a)
		System.out.print(x+" ");
	}
}