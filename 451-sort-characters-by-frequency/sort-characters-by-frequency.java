import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Step 1: Count the frequency of each character in the string.
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Convert the map entries to a list and sort them based on frequency in descending order.
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());
        
        // Step 3: Build the result string based on the sorted frequencies.
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            char c = entry.getKey();
            int freq = entry.getValue();
            // Append the character 'freq' number of times
            result.append(String.valueOf(c).repeat(freq));
        }
        
        return result.toString();
    }
}