class Solution {
    public boolean checkPowersOfThree(int n) {
        // Keep dividing by 3 and check the remainder
        while (n > 0) {
            // If the remainder is 2, return false
            if (n % 3 == 2) {
                return false;
            }
            // Divide by 3 to check the next power
            n /= 3;
        }
        // If no remainder was 2, it means it's a valid sum of distinct powers of 3
        return true;
    }
}
