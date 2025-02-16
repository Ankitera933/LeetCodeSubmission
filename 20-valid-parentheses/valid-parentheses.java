class Solution {
    public boolean isValid(String s) {
        // Continue until there are no more valid pairs to remove
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            // Remove the matching pairs
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }
        
        // If the string is empty, all brackets have been removed and it's valid
        return s.isEmpty();
    }
}
