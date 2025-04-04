class Solution {
    public long maximumTripletValue(int[] nums) {
        long diff=0;
        long res=0;
        long prefix=0;
        for(int i=0;i<nums.length;i++){
            res=Math.max(res,diff*(long)nums[i]);
            prefix=Math.max(prefix,nums[i]);
            diff=Math.max(diff,prefix-nums[i]);
        }
        return res;
    }
}