import java.util.*;

public class Find_Pair_LinkedList_Whose_Diff_Given
{
    static void findPair(ArrayList<Integer> arrlst, int diff){
        
        HashSet <Integer> hset = new HashSet<Integer>(); 
        for(int i = 0; i< arrlst.size();i++){
            if(hset.contains((arrlst.get(i)-diff))){
                System.out.print(arrlst.get(i)+","+(arrlst.get(i)-diff));
                return;
            }
            if(hset.contains(arrlst.get(i)+diff)){
                System.out.print("("+arrlst.get(i)+","+arrlst.get(i)+diff+")");
                return;
            }
            hset.add(arrlst.get(i));
            
        }
        System.out.print("No pair found");
        
    }
    
    static int takeInput(ArrayList<Integer> arrlst){
        Scanner sc = new Scanner(System.in);
        
        int value = sc.nextInt();
        while(value!=-1){
            arrlst.add(value);
            value = sc.nextInt();
        }
        int diff=sc.nextInt();
        return diff;
    }
    
	public static void main(String[] args) {
	ArrayList<Integer> arrlst = new ArrayList<Integer>();
	int diff = takeInput(arrlst);
	findPair(arrlst,diff);
	
	
// 	for(int ele:arrlst){
// 	    System.out.print(ele+" ");
// 	}
		
	//System.out.print("longest consecutive count "+FindLongestSubSequence(arr));
		
	}
}
