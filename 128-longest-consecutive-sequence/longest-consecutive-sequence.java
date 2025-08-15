import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]); // add all numbers to HashSet
        }

        int max = 0;

        // iterate over HashSet using an array of its elements and index
        Integer[] arr = set.toArray(new Integer[0]); // convert set to array

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            // only start counting if num-1 is not in the set
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                max = Math.max(max, length);
            }
        }

        return max;
    }
}
