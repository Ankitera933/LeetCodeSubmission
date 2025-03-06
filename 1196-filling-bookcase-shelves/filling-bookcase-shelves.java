public class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int[] dp = new int[n + 1]; // dp[i] represents the minimum height for first i books
        for (int i = 0; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE; // Initialize dp array to a large number
        }
        dp[0] = 0; // No books, no height
        
        // Iterate through each book
        for (int i = 1; i <= n; i++) {
            int currentWidth = 0;  // To track the current width of books on the shelf
            int currentHeight = 0; // To track the maximum height of books on the shelf
            // Try placing books from j to i on the same shelf
            for (int j = i - 1; j >= 0; j--) {
                currentWidth += books[j][0];  // Add the thickness of the book
                if (currentWidth > shelfWidth) {
                    break; // If the current width exceeds shelfWidth, stop considering this combination
                }
                currentHeight = Math.max(currentHeight, books[j][1]); // Track the maximum height
                dp[i] = Math.min(dp[i], dp[j] + currentHeight); // Update dp[i]
            }
        }
        
        return dp[n]; // The answer is the minimum height for all books
    }
}