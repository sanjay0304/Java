import java.util.*;
public class PrintNNumbers
{
    static void PrintNAsc(int N){
        
        if(N<=0)
        return;
        
        PrintNAsc(N-1);
        System.out.print(N+" ");
               
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
	    PrintNAsc(N);
	
    }
}