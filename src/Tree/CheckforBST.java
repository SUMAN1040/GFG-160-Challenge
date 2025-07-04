/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Tree;

class Solution {
    boolean isBST(Node root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBST(Node node, int min, int max) {
        return node == null || (node.data > min && node.data < max &&
                isBST(node.left, min, node.data) &&
                isBST(node.right, node.data, max));
    }
}