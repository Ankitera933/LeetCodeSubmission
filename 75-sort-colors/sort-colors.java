class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        // Traverse the array
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid); // Place 0 at the beginning
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++; // Leave 1 in the middle
            } else { // nums[mid] == 2
                swap(nums, mid, high); // Place 2 at the end
                high--;
            }
        }
    }

    // Helper function to swap elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
