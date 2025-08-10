class Solution {
    public int maxProfit(int[] prices) {
        int curr=0;
        int max=0;
        int left=0;
        for(int right=1;right<prices.length;right++){
            if(prices[left]>prices[right]){
                left=right;

            }
            else{
                curr=Math.max(prices[right]-prices[left],curr);
             
            }
           
        }
        return curr;

    }
}