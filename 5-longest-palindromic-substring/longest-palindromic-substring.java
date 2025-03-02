class Solution {
    public String longestPalindrome(String s) {
        // If the input string is empty or has a single character, return it directly
        if (s == null || s.length() < 1) {
            return "";
        }
        
        String longest = "";
        
        // Loop through each character and treat it as the center of a potential palindrome
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes (single character center)
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }

            // Check for even-length palindromes (two character center)
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }

        return longest;
    }

    // Helper method to expand around the center and return the longest palindrome
    private String expandAroundCenter(String s, int left, int right) {
        // Expand as long as the characters at the left and right pointers match
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
      
        return s.substring(left + 1, right);
    }
}
