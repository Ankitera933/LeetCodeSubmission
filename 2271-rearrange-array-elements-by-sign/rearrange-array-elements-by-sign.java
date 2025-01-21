class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int []temp=new int[n/2];
        int []temp2=new int[n/2];
        int []temp3=new int[n];
        int posetive=0;
        int negative=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                temp[posetive]=nums[i];
                posetive++;
            }
            else{
                temp2[negative]=nums[i];
                negative++;
            }


        }
        posetive=0;
        negative=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                temp3[i]=temp[posetive];
                posetive++;
            }
            else{
                temp3[i]=temp2[negative];
                negative++;
            }
        }
            System.arraycopy(temp3,0,nums,0,n);
        return nums;
    }
}