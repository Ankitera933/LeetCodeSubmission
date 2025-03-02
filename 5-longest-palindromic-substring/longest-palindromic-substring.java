class Solution {
    public String longestPalindrome(String s) {

        if(s.length()==1){
            return s;
        }
        if(s.length()==2){
            if(s.charAt(0)==s.charAt(1)){
            return s;
            }
            else{
                
                return String.valueOf(s.charAt(0));
            }
        }

        String longest="";

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                    String str=s.substring(i,j);

                    if(isPalindrome(str)&& str.length()>longest.length()){
                        longest=str;
                    }
            }
        }
        return longest;
    
    }
    public static boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}