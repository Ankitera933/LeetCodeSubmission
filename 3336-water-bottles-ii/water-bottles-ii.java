class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrink=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
        totalDrink++;
        empty-=numExchange;
        empty++;
        numExchange++;
            
        }
        return totalDrink;
    }
}