/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Tree;

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> inOrder(Node r) {
        ArrayList<Integer> a = new ArrayList<>();
        f(r, a);
        return a;
    }
    void f(Node r, ArrayList<Integer> a) {
        if (r == null) return;
        f(r.left, a);
        a.add(r.data);
        f(r.right, a);
    }
}