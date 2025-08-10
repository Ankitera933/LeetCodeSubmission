class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>Arr=new ArrayList<>();
        for(int i=0;i<numRows;i++){

            List<Integer>ans=new ArrayList<>();
            ans.add(1);
            for(int j=1;j<i;j++){
                int value=Arr.get(i-1).get(j-1)+Arr.get(i-1).get(j);
                ans.add(value);
            }
            if(i>0){
                 ans.add(1);
            }
            Arr.add(ans);
           
        }
        return Arr;

    }
}