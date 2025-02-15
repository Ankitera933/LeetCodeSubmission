class Solution {
    public void reverseString(char[] s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length;i++){
            str.append(s[i]);
        }
        str.reverse();
        for(int i=0;i<str.length();i++){
            s[i]=str.charAt(i);
        }


    }
}