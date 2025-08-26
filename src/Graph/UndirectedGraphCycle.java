/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Graph;

class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, adj, visited)) return true;
            }
        }
        return false;
    }

    private boolean dfs(int node, int parent, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int nei : adj.get(node)) {
            if (!visited[nei]) {
                if (dfs(nei, node, adj, visited)) return true;
            } else if (nei != parent) {
                return true;
            }
        }
        return false;
    }
}