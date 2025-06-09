class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2=nums2.length;
        int []arr=new int[n2];
        Stack<Integer> stack=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
           while(!stack.isEmpty() && nums2[i]>stack.peek()){
            stack.pop();
           }
           arr[i]=stack.isEmpty()?-1:stack.peek();
           stack.push(nums2[i]);
        }
        int []res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<n2;j++){
                if(nums2[j]==nums1[i]){
                    res[i]=arr[j];
                    break;
                }
            }
        }
        return res;
    }
}