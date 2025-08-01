/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Stack;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            while (!s.isEmpty() && s.peek() <= val) s.pop();
            arr[i] = s.isEmpty() ? -1 : s.peek();
            s.push(val);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : arr) res.add(num);
        return res;
    }
}