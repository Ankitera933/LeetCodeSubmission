class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String>list=new ArrayList<>();
        list.add(words[0]);


        for(int i=1;i<words.length;i++){
         if(!IsAnagram(words[i],list.get(list.size()-1))){
 list.add(words[i]);
         }

        
        }
        return list;
    }
    public Boolean IsAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int[]freq=new int[26];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if (freq[i]!=0){
                return false;
            }

        }
        return true;

    }
}