class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int max=0;
       
      for(int right=0;right<nums.length;right++){
        if(nums[left]==nums[right] && nums[right]==1){
            max=Math.max(right-left+1,max);

        }
        else{
            left=right+1;
        }
      }
      return max;
    }
}