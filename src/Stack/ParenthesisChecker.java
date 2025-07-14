/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Stack;


class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray())
            if ("({[".indexOf(c) >= 0) st.push(c);
            else if (st.isEmpty() || Math.abs(st.peek() - c) > 2) return false;
            else st.pop();
        return st.isEmpty();
    }
}
