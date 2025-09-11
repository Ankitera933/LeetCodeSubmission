import java.util.*;

class Solution {
    public String sortVowels(String s) {
        int count = 0;

        // Count vowels
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }

        // Collect vowels
        char[] ch2 = new char[count];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                ch2[index++] = ch;
            }
        }

        // Sort vowels
        Arrays.sort(ch2);

        // Rebuild with sorted vowels
        int index2 = 0;
        StringBuilder sb = new StringBuilder(s); // ✅ initialize with original string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                sb.setCharAt(i, ch2[index2++]);
            }
        }

        return sb.toString();
    }

    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
