class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) 
    {
        Map<Integer,Integer> m1 = new HashMap<>(); //stores prefix sum
        m1.put(0,1);
        int sum = 0, cnt = 0;

        for(int num:nums)
        {
            sum+=num;

            if(m1.containsKey(sum-goal))
                cnt+=m1.get(sum-goal);

            m1.put(sum,m1.getOrDefault(sum,0)+1);
        }

        return cnt;
    }
}