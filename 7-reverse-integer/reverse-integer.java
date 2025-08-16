class Solution {
    public int reverse(int x) {
        int num=x;
        int last=0;
        while(num!=0){
           int div=num%10;
             if (last > Integer.MAX_VALUE / 10 || 
                (last == Integer.MAX_VALUE / 10 && div > 7)) {
                return 0; // overflow
            }
            if (last < Integer.MIN_VALUE / 10 || 
                (last == Integer.MIN_VALUE / 10 && div < -8)) {
                return 0; // underflow
            }
            last=last*10+div;
            num=num/10;
            
        }
        return last;

    }
}