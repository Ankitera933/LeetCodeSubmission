import java.util.HashSet;

class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        // Use a HashSet to track the valid subsets
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        long result = 0;
        
        // Iterate over all possible subsets
        for (int mask = 1; mask < (1 << n); mask++) {  // Iterate over all non-empty subsets
            HashSet<Integer> subset = new HashSet<>();
            boolean valid = true;

            // Form the current subset from the mask
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    // Check if the difference condition is violated
                    for (int num : subset) {
                        if (Math.abs(num - nums[i]) == k) {
                            valid = false;
                            break;
                        }
                    }
                    if (!valid) break;
                    subset.add(nums[i]);
                }
            }

            // If the subset is valid, increment the result count
            if (valid) {
                result++;
            }
        }
        
        return (int) result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {2, 4, 6};
        int k1 = 2;
        System.out.println(sol.beautifulSubsets(nums1, k1));  // Output: 4
        
        int[] nums2 = {1};
        int k2 = 1;
        System.out.println(sol.beautifulSubsets(nums2, k2));  // Output: 1
    }
}
