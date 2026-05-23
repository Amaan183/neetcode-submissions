class MinStack {
    private Stack<Integer> minStack;
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            minStack.push(val);
        }
        if(minStack.peek()<val){
            minStack.push(minStack.peek());
        }
        else{
            minStack.push(val);
        }

        stack.push(val);        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
