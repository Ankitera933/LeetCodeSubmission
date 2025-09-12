class Solution {
    public boolean doesAliceWin(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }  
       return count>0?true:false; 
    }
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}