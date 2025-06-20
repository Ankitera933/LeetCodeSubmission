class Solution {
    public int maxPower(String s) {
     int j=0;
     int i=0;
     int maxCount=0;
     int n=s.length();
     while(j<n){
        char ch=s.charAt(j);
        if(s.charAt(i)==s.charAt(j)){
            j++;
            maxCount=Math.max(maxCount,j-i);
        }
        else{
            i=j;
        }
        
     }   
     return maxCount;
    }
}