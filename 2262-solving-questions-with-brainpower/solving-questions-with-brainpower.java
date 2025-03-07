
class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        
        // DP array to store maximum points from i-th question onward
        long[] dp = new long[n + 1];  // n+1 to handle boundary conditions
        
        // Process each question in reverse order
        for (int i = n - 1; i >= 0; i--) {
            int points = questions[i][0];
            int brainpower = questions[i][1];
            
            // Option 1: Skip the current question
            long skip = dp[i + 1];
            
            // Option 2: Solve the current question (if possible)
            long solve = points + (i + brainpower + 1 < n ? dp[i + brainpower + 1] : 0);
            
            // Take the maximum of solving or skipping the current question
            dp[i] = Math.max(skip, solve);
        }
        
        // The result is stored in dp[0], i.e., the maximum points from the first question onward
        return dp[0];
    }
}
