import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currSum = 0;
        HashMap<Integer, Integer> prefixMap = new HashMap<>();

        prefixMap.put(0, 1); // base case: sum = 0 seen once

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            // Check if there exists a prefix sum that adds up to k
            if (prefixMap.containsKey(currSum - k)) {
                count += prefixMap.get(currSum - k);
            }

            // Store/update current prefix sum
            prefixMap.put(currSum, prefixMap.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}
