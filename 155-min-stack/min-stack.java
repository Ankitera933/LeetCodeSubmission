class MinStack {
Stack<Integer>stack;
    public MinStack() {
        stack=new Stack<>();

    }
    
    public void push(int val) {
        
        stack.push(val);
        
    }

    
    public void pop() {
        if(!stack.isEmpty()){

        stack.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()){
        return stack.peek();}
        return -1;
    }
    
    public int getMin() {
        int min =Integer.MAX_VALUE;
        for(int i=0;i<stack.size();i++){
            if(stack.get(i)<min){
                min=stack.get(i);
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */