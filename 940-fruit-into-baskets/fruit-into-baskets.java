class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2){
                int leftInt=fruits[left];
                map.put(leftInt,map.get(leftInt)-1);
                if(map.get(leftInt)==0){
                    map.remove(leftInt);
                }
                left++;
            }
            max=Math.max(right-left+1,max);

        
        }
        return max;
    }
}