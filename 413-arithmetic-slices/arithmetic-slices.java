class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;

        int count = 0;
        int current = 0;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) {
                current++;         // one more slice ends here
                count += current;  // add all new slices ending at i
            } else {
                current = 0;       // reset if the diff breaks
            }
        }

        return count;
    }
}
