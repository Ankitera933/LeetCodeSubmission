class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle.length()==1)return columnTitle.charAt(0)-64;
        int sum=0;
        for(int i=0;i<columnTitle.length();i++){
            char ch=columnTitle.charAt(i);
           
            sum=sum*26+(ch-'A'+1);
        }
        return sum;
    }
}