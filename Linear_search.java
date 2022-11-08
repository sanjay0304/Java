import java.util.*;
//LINRAR SEARCH 
public class Linear_search
{
    public static int indexOf(int arr[],int search){
        int cnt=0;
         for(int i=0;i<arr.length;i++){
	        if(arr[i]==search){
	           cnt++;
	        }else
	        continue;
        
        
    }
    if(cnt>0){
       return cnt; 
    }else
    return -1;
    }
	public static void main(String[] args) {
	    int arr[] ={1,2,3,5,7,8,10,16,20,30,45,52,78,156,200,8};
	    Scanner sc = new Scanner(System.in);
	    int search_element = sc.nextInt();
	    int found = indexOf(arr,search_element);
	    if(found>0){
	        System.out.print(search_element +" found " + found +" times");
	    }else{
	        System.out.print("Not found");
	    }
	   
	    }
}