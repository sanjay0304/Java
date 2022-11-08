// insertion sort brawling over 350 dated: 16/05/2022 time:18:45 
public class Insertionsort
{
	public static void main(String[] args) {
		int arr[] = {8,2,4,9,1,5,3,6,7,500,450,400,333,320,200,100,99,88,77,66,55,44,33,22};
		//	 j0 i1	
		for(int i=1;i<arr.length;i++){//2 4 8 9 1
		    int key = arr[i];	            //          j3 i4
		    int j = i-1;
		    
		    while(j>=0 && arr[j]>key){
		        
		        arr[j+1] = arr[j];
		        j--;
		    }
		    
		    arr[j+1]=key;
		    
		}
		
		for(int x:arr)
		    System.out.print(x+" ");
		
	}
}
