/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Stack;

class Solution {
    private Stack<Integer>s = new Stack<>();
    private Stack<Integer>minStack = new Stack<>();

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        s.push(x);
        if(minStack.isEmpty() || x<= minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop() {

        // code here
        if(!s.isEmpty()){
            if(s.peek().equals(minStack.peek())){
                minStack.pop();
            }
            s.pop();
        }
    }

    public int peek() {
        // code here
        return s.isEmpty() ? -1 : s.peek();
    }


    public int getMin() {
        // code here
        return minStack.isEmpty() ? -1: minStack.peek();
    }
}