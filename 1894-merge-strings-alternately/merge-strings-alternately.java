class Solution {
    public String mergeAlternately(String word1, String word2) {
        int ptr1=0;
        int ptr2=0;
        String str="";
        while(ptr1<word1.length()&& ptr2<word2.length()){
            char ch=word1.charAt(ptr1); 
            char ch2=word2.charAt(ptr2);
            str=str+ch;
            str=str+ch2;
            ptr1++;
            ptr2++;

        }
        while(ptr1<word1.length()){
            char ch=word1.charAt(ptr1);
            str=str+ch;
            ptr1++;
        }
        while(ptr2<word2.length()){
            char ch2=word2.charAt(ptr2);
            str=str+ch2;
            ptr2++;
        }
        return str;
    }
}