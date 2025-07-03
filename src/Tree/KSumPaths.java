/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Tree;

/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/


class Solution {
    int count = 0;

    public int sumK(Node root, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        dfs(root, 0, k, map);
        return count;
    }

    private void dfs(Node node, int currSum, int k, Map<Integer, Integer> map) {
        if (node == null) return;

        currSum += node.data;

        count += map.getOrDefault(currSum - k, 0);

        map.put(currSum, map.getOrDefault(currSum, 0) + 1);

        dfs(node.left, currSum, k, map);
        dfs(node.right, currSum, k, map);

        map.put(currSum, map.get(currSum) - 1);
    }
}