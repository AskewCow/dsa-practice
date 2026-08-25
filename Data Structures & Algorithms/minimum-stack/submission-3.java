class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }
    
    public void push(int val) {
        stack.addFirst(val);
        if(minStack.isEmpty() || minStack.peek() >= val) minStack.addFirst(val);
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int val = stack.remove();

        if(!minStack.isEmpty() && minStack.peek() == val) minStack.remove();
    }
    
    public int top() {
        if(!stack.isEmpty()) return stack.peek();
        return -1;
    }
    
    public int getMin() {
        if(!minStack.isEmpty()) return minStack.peek();
        return -1;
    }
}
