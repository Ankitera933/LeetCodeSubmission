class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        ArrayList<Integer>list=new ArrayList<>();
        int ptr1=0;
        int ptr2=0;

        while(ptr1<m && ptr2<n){
            if(nums1[ptr1]<nums2[ptr2] ){
                list.add(nums1[ptr1]);
                ptr1++;
            }
            else{
                list.add(nums2[ptr2]);
                ptr2++;
            }
        }
         while (ptr1 < m) {
            list.add(nums1[ptr1++]);
        }
        while (ptr2 < n) {
            list.add(nums2[ptr2++]);
       }
           for (int i = 0; i < list.size(); i++) {
            nums1[i] = list.get(i);
        }
        
    }
}