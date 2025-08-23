class Solution {
    public int longestSubstring(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue() < k) {
                char badChar = entry.getKey();
                int maxLen = 0;
                for (String part : s.split(Character.toString(badChar))) {
                    maxLen = Math.max(maxLen, longestSubstring(part, k));
                }
                return maxLen;  // return after handling split
            }
        }

        // If all chars are valid
        return s.length();
    }
}
