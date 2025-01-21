class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>Posetive=new ArrayList<>();
        ArrayList<Integer>Negative=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                Posetive.add(nums[i]);
            }
            else{
                Negative.add(nums[i]);
            }
        }
        int []result=new int[n];
        int pos=0;
        int neg=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                result[i]=Posetive.get(pos);
                pos++;
            }
            else{
                result[i]=Negative.get(neg);
                neg++;
            }
        }
        System.arraycopy(result,0,nums,0,n);
        return nums;
    }
}