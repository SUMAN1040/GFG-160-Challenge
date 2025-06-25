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

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    int height(Node node) {
        if (node == null) return -1;
        int left = height(node.left);
        int right = height(node.right);
        return 1 + Math.max(left, right);
    }
}