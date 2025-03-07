class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        
        // Combine scores and ages into a 2D array of players
        int[][] players = new int[n][2];
        for (int i = 0; i < n; i++) {
            players[i][0] = scores[i];  // scores[i]
            players[i][1] = ages[i];    // ages[i]
        }
        
        // Sort players by age first, then by score if ages are equal
        Arrays.sort(players, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);

        // DP array where dp[i] represents the maximum score starting from player i
        int[] dp = new int[n];
        int maxScore = 0;

        // Fill the dp array
        for (int i = 0; i < n; i++) {
            dp[i] = players[i][0]; // Initially, the max score including only this player is their score
            for (int j = 0; j < i; j++) {
                // If we can add player i to the team of player j
                if (players[j][0] <= players[i][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + players[i][0]);
                }
            }
            maxScore = Math.max(maxScore, dp[i]);
        }

        return maxScore;
    }
}
