class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;
        int n = cardPoints.length;

        // Initial left sum: take first k cards from the start
        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }

        maxSum = leftSum; // case when taking all k cards from left

        // Now try taking i cards from the end, and (k - i) from the start
        for (int i = 1; i <= k; i++) {
            leftSum -= cardPoints[k - i];           // remove one from the left
            rightSum += cardPoints[n - i];          // add one from the right
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }

        return maxSum;
    }
}
