class Solution {
    public int maxProfit(int[] prices) {
        int minPrice= Integer.MAX_VALUE;
        int currentPrice=0;
        int finalPrice=0;
        for(int i=0;i<prices.length;i++){
        minPrice=Math.min(minPrice,prices[i]);
        currentPrice=prices[i]-minPrice;
        finalPrice=Math.max(finalPrice,currentPrice);
        }
        return finalPrice;
    }
}