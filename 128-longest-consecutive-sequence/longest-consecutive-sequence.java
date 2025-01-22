class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n<=0){
            return 0;
        }
        HashSet<Integer>Set=new HashSet<>();
        for(int i=0;i<n;i++){
            Set.add(nums[i]);
        }
        int longest=1;
        Integer[]element=Set.toArray(new Integer[0]);
        for(int i=0;i<element.length;i++){
            int itr=element[i];
            if(!Set.contains(itr-1)){
                int count=1;
                int current=itr;
                while(Set.contains(current+1)){
                    count+=1;
                    current+=1;
                }

                longest=Math.max(longest,count);

            }
        }
        return longest;

    }
}