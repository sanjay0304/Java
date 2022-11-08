import java.util.*;
//*******************************************************************************
public class QuickSort
{
    static int pivotPos(int arr[], int s, int e){
        
        int i=s-1;int pivot=arr[e];
        for(int j = s;j < e;j++){
            if(arr[j]<pivot){
               i++; 
               swap(arr,i,j);
            }
        }
        i++;
        swap(arr,i,e);
        return i;  
    }
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void quickSort(int arr[], int s, int e){
        
        if(s<e){
            int pos = pivotPos( arr, s,e);
            quickSort(arr, s, pos-1);
            quickSort(arr, pos+1,e);
        }
        
    }
	public static void main(String[] args) {
		int arr[] = new int[]{20000000,2000000000,5,0,8,2};
		
		quickSort(arr, 0, arr.length-1);
		arr[arr.length-1]+=10000000;
		for(int i=0; i<arr.length;i++)
		System.out.print(" "+arr[i]);
	}
	
}