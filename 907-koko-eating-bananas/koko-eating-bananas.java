class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles); // Maximum element in array
        
        while (left < right) {
            int mid = left + (right - left) / 2; // Try middle value
            
            int total = Calculate(piles, mid); // Calculate total hours needed for speed mid
            
            if (total <= h) {
                right = mid;  // If valid speed, try to find a smaller one
            } else {
                left = mid + 1;  // Otherwise, try a larger speed
            }
        }
        return left; // The smallest valid speed
    }

    // Helper function to find the largest pile
    private int getMax(int[] piles) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        return max;
    }

    // Helper function to calculate the total hours needed to eat all bananas at speed 'speed'
    private int Calculate(int[] piles, int speed) {
        int total = 0;
        for (int i = 0; i < piles.length; i++) {
            total += Math.ceil((double) piles[i] / speed); // Floating-point division to calculate hours
        }
        return total;
    }
}
