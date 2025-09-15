class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr=text.split(" ");
        int n=arr.length;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            char ch=brokenLetters.charAt(i);
            set.add(ch);
        }
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            char[]ch=s.toCharArray();
            int p=1;
            for(int j=0;j<ch.length;j++){
                if(p==1){
                if (set.contains(ch[j])){
                    p=0;
                    n--;
                }
                }
            }
        }
        return n;
    }
}