class Solution {
    public boolean isAnagram(String s, String t) {
        char[]ch=s.toCharArray();
        char[]ch2=t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);
        if (s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            if(ch[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
}