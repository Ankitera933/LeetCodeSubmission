class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int last=-1;
   int i=0;
        while(i<nums.length){
           
            if(nums[i]==1 && last!=-1){
                if(i-last-1<k){
                    return false;
                }
            }
             if(nums[i]==1){
                last=i;
            }
            i++;

            
        }
        return true;
            
        
    }
}