class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 ||(x%10==0 && x !=0)){
            return false;
        }
        int d=x;
        int reverse=0;
        while(d>0){
            reverse=reverse*10+d%10;
            d=d/10;
        }
       return reverse == x;

    }
}