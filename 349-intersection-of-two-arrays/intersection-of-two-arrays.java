class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        int left=0;
        int right=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]>nums2[right]){
                right++;
            }
            else if(nums2[right]>nums1[left]){
                left++;
            }
            else{
                set.add(nums1[left]);
                left++;
                right++;
            }
        }
        int []arr=new int[set.size()];
        int indx=0;
        for(int ele:set){
            arr[indx++]=ele;
           
        }
        return arr;
    }
}