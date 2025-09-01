class Solution {
    public int jump(int[] nums) {
       int totalJump=0;
       int destination=nums.length-1;
       int coverage=0;
       int lastJump=0;
       if(nums.length==1)return 0;
       for(int i=0;i<nums.length;i++){
        coverage=Math.max(coverage,i+nums[i]);
        if(i==lastJump){
            lastJump=coverage;
            totalJump++;

            if(lastJump>=destination){
       return totalJump;
            }
        }
       } 
       

       return totalJump;
    }
}