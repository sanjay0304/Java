
public class Min
{
    static int arr[] = new int[]{55,44,22,12,1,3,7,89,58,64,47};
	public static void main(String[] args) {
	    System.out.print("Length of the array:"+arr.length+"\n");
	    int min = Integer.MAX_VALUE;
	    System.out.print(min+"\n");
		for(int x:arr){
    		if(x<min){
    		    min=x;
    		}
		}
		System.out.print("min value: "+min);
	}
	
}