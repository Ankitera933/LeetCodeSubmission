public class Solution {
    public int maxProduct(String s) {
        int n = s.length();
        int maxProduct = 0;

        // To store the length of palindromic subsequences for each bitmask
        int[] palindromeMasks = new int[1 << n];

        // Generate all subsequences and check if they are palindromic
        for (int mask = 0; mask < (1 << n); mask++) {
            StringBuilder subsequence = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subsequence.append(s.charAt(i));
                }
            }
            // Check if subsequence is palindromic
            if (isPalindrome(subsequence.toString())) {
                palindromeMasks[mask] = subsequence.length();
            }
        }

        // Now we check all pairs of disjoint palindromic subsequences
        for (int mask1 = 0; mask1 < (1 << n); mask1++) {
            if (palindromeMasks[mask1] == 0) continue;  // Skip non-palindromic subsequences

            for (int mask2 = mask1 + 1; mask2 < (1 << n); mask2++) {
                if (palindromeMasks[mask2] == 0) continue;  // Skip non-palindromic subsequences
                // Ensure that the two subsequences are disjoint (no common indices)
                if ((mask1 & mask2) == 0) {
                    maxProduct = Math.max(maxProduct, palindromeMasks[mask1] * palindromeMasks[mask2]);
                }
            }
        }

        return maxProduct;
    }

    // Helper function to check if a string is palindromic
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
