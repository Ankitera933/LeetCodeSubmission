class Solution {
    public int myAtoi(String s) {

        int i=0;
       int result=0;
    int n=s.length();
    int sign=1;
        while(i<n && s.charAt(i)==' ' ) i++;

        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            sign=(s.charAt(i)=='+')? 1:-1;
            i++;
        }

 while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            
            // Check for overflow or underflow before updating result
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        // Apply the sign
        return result * sign;
    }

    
}