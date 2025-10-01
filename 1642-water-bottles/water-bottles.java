class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrink=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int newBottles=empty/numExchange;
            totalDrink+=newBottles;
            empty=newBottles+(empty%numExchange);
        }
        return totalDrink;
    }
}