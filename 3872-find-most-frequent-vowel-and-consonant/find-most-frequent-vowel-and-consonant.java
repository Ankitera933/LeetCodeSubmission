class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>Vowelmap=new HashMap<>();
        HashMap<Character,Integer>Conmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
        Vowelmap.put(ch,Vowelmap.getOrDefault(ch,0)+1);
            }
            else{
         Conmap.put(ch,Conmap.getOrDefault(ch,0)+1);
            }
        }
        int maxV=0;
        int maxC=0;
        for(Map.Entry<Character,Integer>entry:Vowelmap.entrySet()){
            maxV=Math.max(maxV,entry.getValue());
        }
        for(Map.Entry<Character,Integer>entry:Conmap.entrySet()){
            maxC=Math.max(maxC,entry.getValue());
        }
        int sum=0;
        sum=maxV+maxC;
        return sum;

    }
    public Boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}