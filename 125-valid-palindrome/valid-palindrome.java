class Solution {
    public boolean isPalindrome(String s) {
        String str1=s.replaceAll("[\\p{Punct}\\s]+","").toLowerCase();
        int n=str1.length();

       int left=0;
       int right=n-1;
       while(left<=right){
        char ch=str1.charAt(left);
        char ch2=str1.charAt(right);
        if(ch!=ch2){
            return false;
        }
        left++;
        right--;
       }
       return true;

    }
}