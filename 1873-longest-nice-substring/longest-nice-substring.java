class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2){
            return "";
        }
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            set.add(ch);
        }
        for(int i=0;i<s.length();i++){
            if(set.contains(Character.toUpperCase(s.charAt(i))) && set.contains(Character.toLowerCase(s.charAt(i)))){
                continue;
               
            }
            else{
                 String str1=longestNiceSubstring(s.substring(0,i));
                String str2=longestNiceSubstring(s.substring(i+1));
                return str1.length()>=str2.length()?str1:str2;
            }
        }
        return s;
    }
}