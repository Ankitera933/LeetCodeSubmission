class Solution {
    public int[] closestPrimes(int left, int right) {
      int n=right-left;
       int []prime=new int[right+1]; 
        int[] result=new int[]{-1,-1};
        int k=0;
       for(int i=2;i<=right;i++){
        prime[i]=-1;
       }

            for(int i=2;i*i<=right;i++){
                if(prime[i]==-1){
                    for(int j=i*i;j<=right;j+=i){
                            prime[j]=0;
                    }
                }
            }

             

   int prevPrime = -1;
        int minDiff = Integer.MAX_VALUE;

        for (int i = Math.max(left, 2); i <= right; i++) {
            if (prime[i]==-1) {
                if (prevPrime != -1) {
                    int diff = i - prevPrime;
                    if (diff < minDiff) {
                        minDiff = diff;
                        result[0] = prevPrime;
                        result[1] = i;
                    }
                }
                prevPrime = i;
            }
        }
        
        // Return the closest prime pair or [-1, -1] if no pair found
        return result;

    }
}