/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Tree;

/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);
        int left = 0, right = inorder.size() - 1;
        while (left < right) {
            int sum = inorder.get(left) + inorder.get(right);
            if (sum == target) return true;
            if (sum < target) left++;
            else right--;
        }
        return false;
    }

    private void inorderTraversal(Node node, List<Integer> inorder) {
        if (node == null) return;
        inorderTraversal(node.left, inorder);
        inorder.add(node.data);
        inorderTraversal(node.right, inorder);
    }
}