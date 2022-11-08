import java.util.*;
//O(n) usin Deque 

public class FindMin_K_Window_ON 
    {
    static void minInEachKWindow(){
        int k;
        Deque<Integer> de = new LinkedList <Integer>();
        ArrayList<Integer> arrlst = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements of array. End with -1 when done!");
        int n = sc.nextInt();
        while(!(n==-1)){
            arrlst.add(n);
            n = sc.nextInt();
        }
        System.out.print("Please Enter Window Size: ");
        k = sc.nextInt();

        for(int i = 0; i<k ;i++){
            while(!de.isEmpty() && arrlst.get(de.peekLast())>arrlst.get(i)){
                de.pollLast();
            }
            de.add(i);
        }
                
        System.out.print(arrlst.get(de.peek())+" ");
        
        for(int i = k;i<arrlst.size();i++){
            while(!de.isEmpty() &&  de.peek()< (i-k+1)){
                de.poll();
            }
            while(!de.isEmpty() && arrlst.get(de.peekLast())>arrlst.get(i)){
                de.pollLast();
            }
            de.add(i);
            System.out.print(arrlst.get(de.peek())+" ");
        }
        System.out.println();
       
    } 
	public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
// 	    int n = sc.nextInt();
// 	    int[] arr = new int[n];
// 	    for(int i = 0; i<n ; i++){
// 	        arr[i] = sc.nextInt();
// 	    }
// 	    System.out.println("Enter the window size: ");
// 	    int k = sc.nextInt();
// 		//int arr[] = new int[]{5,4,3,4,1,2};
// 		int N = arr.length;
		
	minInEachKWindow();
		
	    
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
