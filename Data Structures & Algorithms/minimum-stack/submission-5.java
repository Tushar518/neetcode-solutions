class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        int newMin = minStack.isEmpty() ? val : Math.min(val, minStack.peek());
        minStack.push(newMin);
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
        minStack.pop();
    }
    
    public int top() {
        return stack.isEmpty()?-1:stack.peek();
    }
    
    public int getMin() {
        return minStack.isEmpty()?-1:minStack.peek();
    }
}
