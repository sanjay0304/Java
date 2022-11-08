import java.util.*;

public class Deque_And_Iterator //O(n^2) // using two loops//i<=n-K-------j=i;j<=i+K
{
    
    static void minInEachKWindow(){
        Deque<Integer> de = new LinkedList <Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(!(n==-1)){
            de.add(n);
            n = sc.nextInt();
            
        }
        de.addFirst(1);
        //de.pollFirst();
        System.out.println(de.pollLast());
        System.out.println(de.peekLast());
        System.out.println(de.peekFirst());
        System.out.println("Size of Deque: "+de.size());
        Iterator it = de.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        
        
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