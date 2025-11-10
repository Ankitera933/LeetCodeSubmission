class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<right){
            char ch=s.charAt(left);
            char ch2=s.charAt(right);

            if(!Character.isLetterOrDigit(ch)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch2)){
                right--;
                continue;
            }

            if(Character.toLowerCase(ch)!=Character.toLowerCase(ch2)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}