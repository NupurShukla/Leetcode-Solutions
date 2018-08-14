class MinStack {
    
    class StackElement{
        public int value;
        public int minSoFar;
        
        public StackElement()
        {
        }
        
        public StackElement(int x, int y)
        {
            value = x;
            minSoFar = y;
        }
    }
    
    private int min = Integer.MAX_VALUE;
    private Stack<StackElement> minStack;
    
    /** initialize your data structure here. */
    public MinStack() {
        minStack = new Stack<StackElement>();
    }
    
    public void push(int x) {
        int min;
        if(minStack.empty())
        {
            min = Integer.MAX_VALUE;
        }
        
        else
        {
            min = minStack.peek().minSoFar;
        }
        
        if(x<min)
        {
            min = x;
        }
        minStack.push(new StackElement(x,min));
    }
    
    public void pop() {
        minStack.pop();
    }
    
    public int top() {
        return minStack.peek().value;
    }
    
    public int getMin() {
        return minStack.peek().minSoFar;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */