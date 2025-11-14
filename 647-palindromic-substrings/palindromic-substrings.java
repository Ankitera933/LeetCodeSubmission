class Solution {
    public int countSubstrings(String s) {
        int count=s.length();
      for(int i=0;i<s.length();i++){
        for(int j=i+1;j<s.length();j++){
            
            if(Palindrome(i,j,s)){
                count++;
            }
        }
      }
      return count;
        
    }
    public boolean Palindrome(int a, int b,String s){
      
        while(a<b){
       if(s.charAt(a)!=s.charAt(b)){
            return false;
        }
        a++;
        b--;
        }
      
        return true;
    }
}