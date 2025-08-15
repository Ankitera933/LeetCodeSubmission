class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left=0;
        int right=0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]==nums2[right]){
                set.add(nums1[left]);
                left++;
                right++;
            }
            else if(nums1[left]<nums2[right]){
                left++;
            }
            else{
                right++;
            }
        }
        int []arr=new int[set.size()];
        int i=0;
        for(int num:set){
            arr[i++]=num;
        }
        return arr;

    }
}