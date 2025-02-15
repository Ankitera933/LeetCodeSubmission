class Solution {
    public String reverseVowels(String s) {
        StringBuilder str=new StringBuilder(s);
        StringBuilder vowel=new StringBuilder();
         
        
          
          for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                vowel.append(c);
            }
          }
          int VowelIndex=vowel.length()-1;
          for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                str.setCharAt(i,vowel.charAt(VowelIndex--));
            }
          }
          return str.toString();
    }
     Boolean isVowel(char c){
            return "aeiouAEIOU".indexOf(c)!=-1;
         }
}