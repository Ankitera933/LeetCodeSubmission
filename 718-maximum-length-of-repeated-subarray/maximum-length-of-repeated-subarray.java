class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int max=Integer.MIN_VALUE;
       

        for(int i=0;i<n1;i++){
            int len=0;
            for(int j=0;j<n2;j++){
             int k=i;
             int l=j;

             while(k<n1 && l<n2 && nums1[k]==nums2[l]){
                k++;
                l++;
                len++;
             }
             max=Math.max(max,len);
             len=0;
            }
        }
        return max;
    }
}