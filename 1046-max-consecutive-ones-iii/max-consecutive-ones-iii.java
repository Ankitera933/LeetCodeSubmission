class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            // If we see a zero, reduce the available flips
            if (nums[right] == 0) {
                k--;
            }

            // If flips used exceed k, shrink window from the left
            while (k < 0) {
                if (nums[left] == 0) {
                    k++; // Reclaim a flip
                }
                left++;
            }

            // Update max length of the valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
