class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=getMax(nums);
        while(left<right){
            int mid=left+(right-left)/2;
            int total=totalH(nums,mid);
            if(total<=threshold){
                right=mid;

            }
            else{
                left=mid+1;
            }


           
        }
         return left;
    }
    public int totalH(int []nums,int h){
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=Math.ceil((double)nums[i]/h);

        }
        return total;
    }
    public int getMax(int []nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
}