class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
        int result=-1;
        for(int i=0;i+2<n;i++){
            if(num.charAt(i)==num.charAt(i+1) && (num.charAt(i)==num.charAt(i+2))){
                result=Math.max(result,num.charAt(i)-'0');
            }
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<3;i++){
            str.append((char)(48+result));
        }
        return result==-1?"":str.toString();
    }
}