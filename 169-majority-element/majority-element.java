class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>Map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=Map.getOrDefault(num,0)+1;
            Map.put(num,count);
            if(count>n/2){
                return num;
            }
        }
        return -1;
    }
}