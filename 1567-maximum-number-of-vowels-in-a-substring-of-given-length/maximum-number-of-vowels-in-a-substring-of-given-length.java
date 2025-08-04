class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                count++;
            }

        }
        
            int max=count;
        for(int j=k;j<s.length();j++){
            char ch=s.charAt(j);
            if(isVowel(ch) && (!isVowel(s.charAt(j-k)))){
                count++;
            }
            else if(!isVowel(ch) &&  isVowel(s.charAt(j-k))){
                count--;
            }
           
            max=Math.max(count,max);
            

        }
        return max;
       
    }
     public boolean isVowel(char ch){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                return true;
            }
           return false;
        }
}