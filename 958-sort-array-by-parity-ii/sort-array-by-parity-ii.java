class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>Even=new ArrayList<>();
        ArrayList<Integer>Odd=new ArrayList<>();
        int EvenIndex=0;
        int OddIndex=1;
        int []result=new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                result[EvenIndex]=nums[i];
                EvenIndex+=2;
            }
            else{
                result[OddIndex]=nums[i];
                OddIndex+=2;
            }
            
        }
        return result;
    }
}