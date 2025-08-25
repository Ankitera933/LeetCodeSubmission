class Solution {
    public boolean isHappy(int n) {
       int p=n;
       
       HashSet<Integer>set=new HashSet<>();
       while(p!=1){
               int sum=0;
       while(p>0){
        int num1=p%10;
        int sqr1=num1*num1;
         sum+=sqr1;
        p=p/10;

       }
       p=sum;

       if(set.contains(p)){
        return false;

       }
       set.add(p);
       }
       return true;

    }
}