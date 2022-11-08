import java.util.*;
public class Hashset
{
	public static void main(String[] args) {
	HashMap <Integer,Integer> table = new HashMap<Integer,Integer>();
	int arr[] = new int[100000];

	for(int i =0;i<100000;i++)
	arr[i]=i;

	for(int i = 0; i<100000;i++){
	table.put(arr[i],i);
	}

	//for(int x:table.keySet())
	//System.out.println(x+" : "+table.get(x));
	
	boolean present;
	for(int i = 0; i<100000;i++){
	present=table.containsKey(i);
	System.out.println(present);
	}
	
	
	System.out.println("size of the table: "+table.size());

}	
}