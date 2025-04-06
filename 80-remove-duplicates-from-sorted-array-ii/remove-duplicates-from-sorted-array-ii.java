class Solution {
    public int removeDuplicates(int[] nums) {
        int count1=0;
        int insert=0;

        HashMap<Integer,Integer>Map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=Map.getOrDefault(num,0);
            if(count<2){
                nums[insert]=nums[i];
                insert++;
                Map.put(num,count+1);
                
            }
        }

        return insert;
    }
}