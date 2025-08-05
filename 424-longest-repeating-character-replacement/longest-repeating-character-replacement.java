class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int max=0;
        int freq=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            freq=Math.max(freq,map.get(ch));


            while((right-left+1)-freq>k){
                char leftChar=s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);

                
                left++;


            }
            max=Math.max(right-left+1,max);
        }
        return max;
    }
}