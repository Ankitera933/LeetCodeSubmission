class Solution {
    public boolean isAnagram(String s, String t) {
        char[]arr=s.toCharArray();
        char[]arr2=t.toCharArray();
        if(s.length()!=t.length())return false;

        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0;i<s.length();i++){
            if(arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}