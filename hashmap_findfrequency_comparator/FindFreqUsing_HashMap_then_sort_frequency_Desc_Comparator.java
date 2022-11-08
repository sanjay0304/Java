import java.util.*;

public class FindFreqUsing_HashMap_then_sort_frequency_Desc_Comparator
{
   
	public static void main(String[] args) {
		int arr[] = new int[]{5,4,3,4,1,2,3,4,5,6,7,11,19};
		
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		
		for(int i = 0; i<arr.length;i++){
		    int indx = i%10;
		    if(map.containsKey(indx)){
		    ArrayList <Integer> arrls = map.get(indx);
		    arrls.add(arr[i]);
		    }else{
		    ArrayList<Integer> arrlst = new ArrayList<Integer>();
		    arrlst.add(arr[i]);
		    map.put(indx,arrlst);
		    }
		}
		
		for(int key:map.keySet()){
		//System.out.print(key+": ");
		ArrayList <Integer> arrrec = map.get(key);
		for(int i:arrrec){
		System.out.print(i+" ");
		}
		}
// 	    Pair arr[] = new Pair[map.size]; 
		
// 		Arrays.sort(arr,new SortUsingComparator());
// 		for(Pair ele :arr)
// 		System.out.println(ele.x+" "+ele.y);
	}
}

class Pair{
    int x;
    int y;
    Pair(int a, int b){
        x=a;
        y=b;
    }
}

class SortUsingComparator implements Comparator<Pair>{
    public int compare(Pair p1,Pair p2 ){
        return p1.x - p2.x;
    }
}
