class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int []arr=new int[n1];
        for(int i=0;i<n1;i++){
            int z=nums1[i];
            boolean found=false;
            for(int j=0;j<n2;j++){
                 if(z==nums2[j]){
                    found=true;
                    for(int k=j+1;k<n2;k++){
                        if(nums2[k]>z){
                            arr[i]=nums2[k];
                            found=false;
                            break;
                        }
                    }
                    if(found){
                        arr[i]=-1;
                    }
                 }
            }
           
        }
        return arr;
    }
}