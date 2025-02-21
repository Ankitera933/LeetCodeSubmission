class Solution {
    public int titleToNumber(String col) {
        int l=col.length();
        int result=0;
        int p=0;
        for(int i=l-1;i>=0;i--){
            int temp=col.charAt(i)-64;
            result+=Math.pow(26,p++)*temp;
        }
        return result;
    }

}