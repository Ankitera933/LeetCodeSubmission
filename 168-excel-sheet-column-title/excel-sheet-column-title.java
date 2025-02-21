class Solution {
    public String convertToTitle(int col) {
        StringBuilder res=new StringBuilder();
        while(col>0){
            col--;
            int remainder=col%26;
            char ch=(char)(remainder +'A');
            res.append(ch);
            col=col/26;
        }
        return res.reverse().toString();
        
    }
}