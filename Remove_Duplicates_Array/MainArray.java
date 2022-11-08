import java.util.*;
public class MainArray{

public static void main(String[] args){
int arr[] = {2,5,8,6,7,8};
System.out.print("Enter number to be deleted from this array");
int i = 0;
while(i < arr.length){
System.out.print(arr[i]+" ");
i++;
}
Scanner sc = new Scanner(System.in);
int target = sc.nextInt();
int n = Array.removeDuplicates(arr,target);
i =0;
while(i < n){
System.out.print(arr[i]+" ");
i++;
}
i=0;
System.out.print("original array after removing "+target);
while(i < arr.length){
System.out.print(arr[i]+" ");
i++;
}
}


}