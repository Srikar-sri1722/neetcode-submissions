class MinStack {
    private Stack<Integer>mainstack;
    private Stack<Integer>minstack;
    public MinStack() {
        mainstack=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int val) {
        mainstack.push(val);
        if(minstack.isEmpty()||val<=minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        if(minstack.peek().equals(mainstack.peek())){
            mainstack.pop();
            minstack.pop();
        }else{
            mainstack.pop();
        }
    }
    
    public int top() {
        return mainstack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
