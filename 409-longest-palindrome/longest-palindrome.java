class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // ASCII range
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int total = 0;
        boolean hasOdd = false;

        for (int count : freq) {
            total += (count / 2) * 2; // take only pairs
            if (count % 2 == 1) {
                hasOdd = true;
            }
        }

        if (hasOdd) total += 1; // one odd char can be in the middle
        return total;
    }
}
