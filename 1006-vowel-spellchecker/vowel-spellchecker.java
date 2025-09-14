import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> caseMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();

        // Build maps and set
        for (String w : wordlist) {
            exact.add(w);

            // convert to lowercase (manual loop)
            StringBuilder lower = new StringBuilder();
            for (char c : w.toCharArray()) {
                lower.append(Character.toLowerCase(c));
            }
            String lowerStr = lower.toString();

            // replace vowels with '*'
            StringBuilder devowel = new StringBuilder();
            for (char c : lowerStr.toCharArray()) {
                if ("aeiou".indexOf(c) >= 0) devowel.append('*');
                else devowel.append(c);
            }
            String devowelStr = devowel.toString();

            caseMap.putIfAbsent(lowerStr, w);
            vowelMap.putIfAbsent(devowelStr, w);
        }

        // Process queries
        String[] result = new String[queries.length];
        int idx = 0;
        for (String q : queries) {
            if (exact.contains(q)) {
                result[idx] = q;
            } else {
                // lowercase query
                StringBuilder lower = new StringBuilder();
                for (char c : q.toCharArray()) {
                    lower.append(Character.toLowerCase(c));
                }
                String lowerStr = lower.toString();

                // devowel query
                StringBuilder devowel = new StringBuilder();
                for (char c : lowerStr.toCharArray()) {
                    if ("aeiou".indexOf(c) >= 0) devowel.append('*');
                    else devowel.append(c);
                }
                String devowelStr = devowel.toString();

                if (caseMap.containsKey(lowerStr)) {
                    result[idx] = caseMap.get(lowerStr);
                } else if (vowelMap.containsKey(devowelStr)) {
                    result[idx] = vowelMap.get(devowelStr);
                } else {
                    result[idx] = "";
                }
            }
            idx++;
        }

        return result;
    }
}
