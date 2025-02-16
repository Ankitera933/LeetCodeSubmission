class Solution {
    public String removeOuterParentheses(String s) {
      int len=s.length();
      StringBuilder result=new StringBuilder();
      int index=0;
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        
        if(c=='('){
            if(index>0){
            result.append(c);
            
        }
        index++;
        }
        else{
            index--;
            if(index>0){
                result.append(c);
            }

        }
      }
      return result.toString();
    }
}