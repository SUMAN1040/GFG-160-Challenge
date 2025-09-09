/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Graph;

// User function Template for Java

/*
    class Node{
        int val;
        ArrayList<Node> neighbors;
        public Node(){
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val){
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, ArrayList<Node> neighbors){
            this.val = val;
            this.neighbors = neighbors;
        }
    }
*/
class Solution {
    Node cloneGraph(Node node) {
        // code here
        if (node == null) return null;

        HashMap<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        // Clone first node
        Node clone = new Node(node.val, new ArrayList<>());
        map.put(node, clone);
        queue.add(node);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            for (Node nei : curr.neighbors) {
                if (!map.containsKey(nei)) {
                    // Clone neighbor if not cloned
                    map.put(nei, new Node(nei.val, new ArrayList<>()));
                    queue.add(nei);
                }
                // Link neighbor clone
                map.get(curr).neighbors.add(map.get(nei));
            }
        }

        return clone;
    }
}