class Solution {
    public int compress(char[] chars) {
        int k=0;
        for(int i=0;i<chars.length;){
            int count=0;
            char current=chars[i];
            int j;
          for( j=i;j<chars.length && chars[j]==current;j++){
            count++;
          }
          chars[k++]=current;
          if(count>1){
            String str=String.valueOf(count);
            for(int m=0;m<str.length();m++){
                chars[k++]=str.charAt(m);
            }
            
          }
          i=j;
        }
        return k;
    }
}