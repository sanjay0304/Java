import java.util.*;
//Bubble Sort. TC-- O(n^2)
class BubbleSortDesc{
	static void sort(int[] arr){
	int N = arr.length;
		for(int i = 0; i < N - 1; i++){
			for(int j = 0;j<N-1-i;j++ ){
				if(arr[j]<arr[j+1]){
				//Swap
				int temp = arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
				}
			}
		
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