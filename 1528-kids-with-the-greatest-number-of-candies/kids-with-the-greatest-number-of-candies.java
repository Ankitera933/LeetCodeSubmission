class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>List=new ArrayList<>();
        int max=-1;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                List.add(true);
            }
            else{
                List.add(false);
            }
        }
        return List;
    }
}