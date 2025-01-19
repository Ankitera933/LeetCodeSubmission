import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet<>();
        
        int i = 0, j = 0;
        
        // Use two pointers to find common elements
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }

        // Convert set to array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        
        return result;
    }
}
