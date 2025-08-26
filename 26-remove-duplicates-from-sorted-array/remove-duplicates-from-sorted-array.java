class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int index=0;
        for(int ele:set){
            nums[index++]=ele;
        }
        Arrays.sort(nums,0,index);
        return index;
    }
}