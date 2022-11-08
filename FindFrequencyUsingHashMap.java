import java.util.*;

public class FindFrequencyUsingHashMap
{
    static void findFrequency(int[] arr){
        HashMap<Integer,Integer> h_map = new HashMap<Integer,Integer>();
        TreeMap<Integer,Integer> t_map = new TreeMap<Integer,Integer>();
        int n = arr.length;
        for(int i = 0; i<n;i++){
            if(h_map.containsKey(arr[i])){
                h_map.put(arr[i],h_map.get(arr[i])+1);
            }else
            h_map.put(arr[i],1);
            }
            for(int ele:h_map.keySet())
                t_map.put(ele,h_map.get(ele));
                
                for(int ele:t_map.keySet())
                 System.out.println(ele +" "+t_map.get(ele));
             
            System.out.println("Total unique No. in TreeMap "+t_map.size());
        }
	public static void main(String[] args) {
		int arr[] = new int[]{11,10,4,4,2,4,1,7,7,5,2,4,1,5,2,5,3,3,7,8,8,10,11,11,1,5,5,8};
		
		findFrequency(arr);
		
	}
}
