class Solution {
    public boolean divideArray(int[] nums) {

        
        int n=nums.length;

        if(n%2!=0){
            return false;
        }
        Map<Integer,Integer>hm=new HashMap<>();


        for(int i=0;i<n;i++){
            int num=nums[i];
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }
            else{
                hm.put(num,1);
            }

        }

        for(int i=0;i<n;i++){
            int num=nums[i];
            if(hm.containsKey(num) && hm.get(num)%2!=0)
            {
                return false;
            }
        }
        return true;
    }
}