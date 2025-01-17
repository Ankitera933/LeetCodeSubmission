import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);
        
        // Initialize the closest sum to a large value or first triplet sum
        int closestSum = nums[0] + nums[1] + nums[2];
        
        // Iterate through the array, considering each element as the first element of the triplet
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element of the triplet
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            // Set the left and right pointers for the remaining part of the array
            int left = i + 1;
            int right = nums.length - 1;
            
            // Move the pointers and find the closest sum
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                // Update the closest sum if current sum is closer to the target
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                // Move the pointers based on comparison with target
                if (currentSum < target) {
                    left++;  // Increase the sum
                } else if (currentSum > target) {
                    right--; // Decrease the sum
                } else {
                    return currentSum;  // If the sum equals the target, return it
                }
            }
        }
        
        // Return the closest sum found
        return closestSum;
    }
}