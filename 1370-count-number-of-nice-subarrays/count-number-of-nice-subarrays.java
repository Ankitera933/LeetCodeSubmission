class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length, left=0, right = 0 , prefix=0 , res=0;
        
        while(right<n){
            if(nums[right]%2==1){
                prefix=0;
                k--;
            }
            while(k==0)
            {
                k=nums[left]%2;
                left++;
                prefix++;

            }
            res+=prefix;
            right++;
        }
        return res;
    }
}