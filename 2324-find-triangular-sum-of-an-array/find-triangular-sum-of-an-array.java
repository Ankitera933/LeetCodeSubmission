class Solution {
    public int triangularSum(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        int l=nums.length;
        int sum=0;
       
        int j=0;
        while(nums.length>1 ){
            int n=nums.length;
            int[]newNums=new int[n-1];
            for(int i=0;i<n-1;i++){
                newNums[i]=(nums[i]+nums[i+1])%10;
            }
            nums=newNums;
            
        }
        return nums[0];
    }
}