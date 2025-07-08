/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Tree;

/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    Node LCA(Node root, Node n1, Node n2) {
        while (root != null && (root.data > Math.max(n1.data, n2.data) || root.data < Math.min(n1.data, n2.data)))
            root = (root.data > n1.data) ? root.left : root.right;
        return root;
    }
}