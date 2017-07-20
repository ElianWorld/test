public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
       // do initialization if necessary
       stack1 = new Stack<Integer>();
       stack2 = new Stack<Integer>();
    }
    
    public void push(int element) {
        // write your code here
        stack1.push(element);
    }

    public int pop() {
        // write your code here
        if(!stack2.isEmpty()) return stack2.pop();
        else {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }

    public int top() {
        // write your code here
        if(!stack2.isEmpty()) {
            Integer k = stack2.pop();
            stack2.push(k);
            return k;
        }
        else {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            Integer k = stack2.pop();
            stack2.push(k);
            return k;
        }
    }
}