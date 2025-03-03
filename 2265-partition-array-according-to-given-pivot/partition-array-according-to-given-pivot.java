class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int i=0;
        int lesscount=0;
        int[]arr2=new int[n];
        for(int j=0;j<n;j++ ){
            if(nums[j]<pivot){
                arr2[lesscount++]=nums[j];
            }
            else if(nums[j]==pivot){
                i++;
            }
        }

        for(int k=0;k<i;k++){
            arr2[lesscount++]=pivot;
        }

        for(int p=0;p<n;p++){

            if(nums[p]>pivot){
            arr2[lesscount++]=nums[p];
            }
        }
        return arr2;
    }
}