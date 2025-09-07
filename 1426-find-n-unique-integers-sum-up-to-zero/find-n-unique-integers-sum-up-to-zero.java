class Solution {
    public int[] sumZero(int n) {
        if(n==1)return new int[]{0};
    int []zero=new int[n];
   
    
    int index=0;
    if(n%2==0){
        for(int i=1;i<(n/2)+1;i++){
            zero[index++]=i;
            zero[index++]=-1*i;

       }
 }
 if(n%2!=0){
    zero[index++]=0;
    for(int i=1;i<(n+1)/2;i++){
        zero[index++]=i;
        zero[index++]=-1*i;
    }
 }
       return zero;
    }
}