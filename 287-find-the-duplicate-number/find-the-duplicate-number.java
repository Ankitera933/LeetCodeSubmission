class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>Set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(Set.contains(nums[i])){
                return nums[i];
            }
            Set.add(nums[i]);
        }
        return -1;
    }
}