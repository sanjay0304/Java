public class firstMissingEle
{
static int firstMissingEle(int[] arr){
for(int ele:arr){
System.out.print(ele+" ");
}
System.out.println();
        int max = 0, n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] < 0)
                arr[i] = 0;
            max = Math.max(max, arr[i]);
        }
        max++;
        for(int i = 0; i < n; i++){
            int val = arr[i] % max;
            if(val > 0 && val <= n){
                arr[val - 1] = arr[val - 1] + max;
            }
        }
for(int ele:arr){
System.out.print(ele+" ");
}
System.out.println();
        for(int i = 0; i < n; i++){
            if(arr[i] < max)
             return i + 1;
        }
	return max;
}
public static void main(String[] args){
int[] arr = new int[]{200,201,300,400,700,600};
System.out.print(firstMissingEle(arr));
}
}