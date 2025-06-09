import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Step 1: Initialize result array with default value (-1)
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }

        // Step 2: Traverse the array twice to simulate circular behavior
        for (int i = 0; i < 2 * n; i++) {
            // Resolve the next greater element for indices in the stack
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                res[stack.pop()] = nums[i % n];
            }

            // Push current index onto the stack if within bounds
            if (i < n) {
                stack.push(i);
            }
        }

        return res;
    }
}
