import java.util.*;
//Selection Sort. TC-- O(n^2)
class selectionSort{
	static void sort(int[] arr){
	int N = arr.length;
	int min=arr[0];	
		for(int i = 0; i < N - 1; i++){
			for(int j = i;j<N;j++ ){
				if(arr[j]<min)
				min=arr[j];
			}
		arr[i]=min;
		}
			
	}
	static void displayArr(int[] arr){
		for(int x :arr){
		System.out.print(x+" ");
		}
	}
	public static void main(String[] args){
	int arr[]=new int[]{1001,1000,20,30,25,52,88};
	sort(arr);
	displayArr(arr);


	}


}