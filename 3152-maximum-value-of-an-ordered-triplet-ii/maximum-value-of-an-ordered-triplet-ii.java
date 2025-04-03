class Solution {
    public long maximumTripletValue(int[] nums) {
        int prefix_max=nums[0];
        long max_d=0;
        long res=0;

        for(int k=1;k<nums.length;k++){
            res=Math.max(res,max_d*(long)nums[k]);
            max_d=Math.max(max_d,prefix_max-nums[k]);
            prefix_max=Math.max(prefix_max,nums[k]);
        }
        return res;
    }
}