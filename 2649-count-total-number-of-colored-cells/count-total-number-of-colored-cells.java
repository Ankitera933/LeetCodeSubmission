class Solution {
    public long coloredCells(int n) {
    
        long t=n+(n-1);
        long q=t-2;
        long sum=0;
        while(q>0){
            sum+=q;
            q=q-2;
        }
        long ans=2*sum+t;
        return ans;
    }
}