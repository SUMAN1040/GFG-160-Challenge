/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Graph;

class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int V = adj.size();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        adj1.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        adj1.add(new ArrayList<>(Arrays.asList(0)));
        adj1.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj1.add(new ArrayList<>(Arrays.asList(0)));
        adj1.add(new ArrayList<>(Arrays.asList(2)));

        System.out.println(sol.bfs(adj1));

        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        adj2.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj2.add(new ArrayList<>(Arrays.asList(0, 2)));
        adj2.add(new ArrayList<>(Arrays.asList(0, 1, 3, 4)));
        adj2.add(new ArrayList<>(Arrays.asList(2)));
        adj2.add(new ArrayList<>(Arrays.asList(2)));

        System.out.println(sol.bfs(adj2));
    }
}