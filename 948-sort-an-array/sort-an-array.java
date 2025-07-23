class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Step 2: Extract elements one by one from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            // Heapify reduced heap
            heapify(nums, i, 0);
        }

        return nums;
    }

    // Helper function to maintain heap property
    private void heapify(int[] nums, int heapSize, int i) {
        int largest = i;       // Initialize largest as root
        int left = 2 * i + 1;  // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < heapSize && nums[left] > nums[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < heapSize && nums[right] > nums[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = nums[i];
            nums[i] = nums[largest];
            nums[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(nums, heapSize, largest);
        }
    }
}
