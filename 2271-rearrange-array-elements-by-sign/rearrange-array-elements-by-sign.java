class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
       int[]nums1=new int[n/2];
       int []nums2=new int[n/2];
    int indx1=0;
    int indx2=0;
       for(int i=0;i<n;i++){
        if(nums[i]>0){
            nums1[indx1++]=nums[i];
        }
        else{
            nums2[indx2++]=nums[i];
        }
       }
int i=0;
indx1=0;
indx2=0;
       while(i<n){
        nums[i++]=nums1[indx1++];
        nums[i++]=nums2[indx2++];
       }
       return nums;
    }
}