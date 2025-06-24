class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans=0;
        int sum=0;
        int count=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(l<r && (sum>goal || nums[l]==0)){
                if(nums[l]==0){
                    count++;
                }
                else{
                    count=0;
                }
                sum-=nums[l++];
            }
            if(sum==goal){
                ans+=1+count;
            }
        }
        return ans;
    }
}