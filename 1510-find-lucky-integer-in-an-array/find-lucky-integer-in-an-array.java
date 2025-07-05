class Solution {
    public int findLucky(int[] arr) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        int maxLength=-1;
        for (int i = 0; i < keys.size(); i++) {
            int key = keys.get(i);
            int value = map.get(key);

            if(key==value){
                maxLength=Math.max(maxLength,key);
              
            }

    }
    return maxLength;
}
}