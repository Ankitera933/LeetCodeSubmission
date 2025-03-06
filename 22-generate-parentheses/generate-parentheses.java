import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    // Helper function for backtracking
    private void backtrack(List<String> result, String current, int openCount, int closeCount, int n) {
        // Base case: if the current string has n open and n close parentheses, it's valid
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // If we can add an open parenthesis, do so
        if (openCount < n) {
            backtrack(result, current + "(", openCount + 1, closeCount, n);
        }

        // If we can add a close parenthesis (i.e., closeCount < openCount), do so
        if (closeCount < openCount) {
            backtrack(result, current + ")", openCount, closeCount + 1, n);
        }
    }
} // <-- Add this closing brace to close the Solution class
