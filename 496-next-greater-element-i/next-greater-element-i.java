class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1];

        for (int i = 0; i < n1; i++) {
            int z = nums1[i];
            boolean found = false;

            // Iterate through nums2 to find the next greater element for nums1[i]
            for (int j = 0; j < n2; j++) {
                if (nums2[j] == z) {
                    // Start searching for the next greater element from this position
                    found = true;

                    for (int k = j + 1; k < n2; k++) {
                        if (nums2[k] > z) {
                            arr[i] = nums2[k];
                            found = false;
                            break;
                        }
                    }

                    // If no greater element is found, set arr[i] to -1
                    if (found) {
                        arr[i] = -1;
                    }
                    break;
                }
            }
        }
        return arr;
    }
}
