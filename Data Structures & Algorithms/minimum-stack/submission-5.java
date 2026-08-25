class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek() >= val) minStack.push(val);
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int val = stack.pop();

        if(!minStack.isEmpty() && minStack.peek() == val) minStack.pop();
    }
    
    public int top() {
        if(stack.isEmpty()) return -1;
        return stack.peek();
    }
    
    public int getMin() {
        if(minStack.isEmpty()) return -1;
        return minStack.peek();
    }
}
