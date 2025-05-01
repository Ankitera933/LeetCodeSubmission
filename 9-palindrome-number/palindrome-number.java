class Solution {
    public boolean isPalindrome(int x) {
        int d=x;
        int reverse=0;
        while(d>0){
            reverse=reverse*10+d%10;
            d=d/10;
        }
       return reverse == x;

    }
}