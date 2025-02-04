class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0; // To track the depth of parentheses

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) { // Ignore the outermost '('
                    result.append(c);
                }
                balance++; // Increase balance count
            } else { // c == ')'
                balance--; // Decrease balance count
                if (balance > 0) { // Ignore the outermost ')'
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
