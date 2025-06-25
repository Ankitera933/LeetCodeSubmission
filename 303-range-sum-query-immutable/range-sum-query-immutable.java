class NumArray {
    int []arr;
    public NumArray(int[] nums) {
        arr=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }

    }
    
    public int sumRange(int left, int right) {
        if(left==0)return arr[right];
        int ans=0;
      
           ans =arr[right]-arr[left-1];
           
        
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */