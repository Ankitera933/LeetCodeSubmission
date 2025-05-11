class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int Windowsum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            Windowsum+=nums[i];
        }
        int maxSum=Windowsum;
        for(int i=k;i<n;i++){
            Windowsum+=nums[i]-nums[i-k];
            maxSum=Math.max(Windowsum,maxSum);
        }
        return (double)maxSum/k;
    }
}