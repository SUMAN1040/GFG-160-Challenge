/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Stack;

class Solution {
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        for (String token : arr) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                int res = 0;
                if (token.equals("+")) res = a + b;
                else if (token.equals("-")) res = a - b;
                else if (token.equals("*")) res = a * b;
                else res = a / b;
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}