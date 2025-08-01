class Solution {
    public String reverseVowels(String s) {
       int left=0;
       int right=s.length()-1;
       char []ch=s.toCharArray();
       while(left<right){
        if(!isVowel(ch[left])){
            left++;
        }
        else if(!isVowel(ch[right])){
            right--;
        }
        else{
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
       }
       return String.valueOf(ch);

    }
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e' || ch=='i' || ch=='o' ||ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch== 'O' || ch== 'U'){
            return true;
        }
        return false;
    }
}