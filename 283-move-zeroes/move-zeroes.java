class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;

      for(int right=1;right<nums.length;right++){
        if(nums[left]==0){
             if(nums[right]!=0){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
             }
               }  
               else{
                left++;
               }
    }
}
}