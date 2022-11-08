public class Array {
   static int removeDuplicates(int[] nums, int val) {
        int j=-1;
         for(int i=0;i<nums.length;i++)
         {
             if( nums[i]!=val)
             {
               nums[++j]=nums[i];
         }  
	 
}
        return j+1;
}
}