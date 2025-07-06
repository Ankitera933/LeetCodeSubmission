class FindSumPairs {  int []nums1;
        int []nums2;
HashMap<Integer,Integer>map=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
      
        this.nums1=nums1;
        this.nums2=nums2;
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],map.getOrDefault(nums2[i],0)+1);
        }
    }
    
    public void add(int index, int val) {
        int oldVal = nums2[index];

    // Remove old value from frequency map
    map.put(oldVal, map.get(oldVal) - 1);
            nums2[index]=nums2[index]+val;
               int newVal = nums2[index];
    map.put(newVal, map.getOrDefault(newVal, 0) + 1);
        
    }
    
    public int count(int tot) {
        int count=0;
        for(int i=0;i<nums1.length;i++){
            int sum=0;
          int k=tot-nums1[i];
          if(map.containsKey(k)){
             sum=map.get(k);
          }
        count+=sum;
        }
    return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */