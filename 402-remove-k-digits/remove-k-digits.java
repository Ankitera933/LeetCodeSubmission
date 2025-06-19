class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character>stack=new Stack<>();
        for(int i=0;i<num.length();i++){
            char current = num.charAt(i);
            while(!stack.isEmpty() && k>0 && num.charAt(i)<stack.peek()){
                    stack.pop();
                    k--;
                }
                 stack.push(num.charAt(i));
            }
           
        
        while(k-->0){
            stack.pop();
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<stack.size();i++){
            sb.append(stack.get(i));
        }

        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.length()==0?"0":sb.toString();
    }
}