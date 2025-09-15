class MyQueue {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
          s1.push(x);
    }
    
    public int pop() {
        while(!s1.empty()){
                s2.push(s1.pop());
            }
            int removed=s2.pop();
            while(!s2.empty()){
                s1.push(s2.pop());
            }
            return removed;
    }
    
    public int peek() {
        while(!s1.empty()){
                s2.push(s1.pop());
            }
            int front=s2.peek();
            while(!s2.empty()){
                s1.push(s2.pop());
            }
            return front;
    }
    
    public boolean empty() {
        return s1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */