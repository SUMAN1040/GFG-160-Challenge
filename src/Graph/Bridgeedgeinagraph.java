/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Graph;

class Solution {
    public boolean isBridge(int V, int[][] edges, int c, int d) {
        // code here
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[V];
        dfs(c, visited, adj, c, d, false);
        int count1 = countVisited(visited);

        visited = new boolean[V];
        dfs(c, visited, adj, c, d, true);
        int count2 = countVisited(visited);

        return count1 > count2;
    }

    private void dfs(int node, boolean[] visited, List<List<Integer>> adj, int c, int d, boolean removeEdge) {
        visited[node] = true;
        for (int neigh : adj.get(node)) {

            if (removeEdge && ((node == c && neigh == d) || (node == d && neigh == c))) {
                continue;
            }
            if (!visited[neigh]) {
                dfs(neigh, visited, adj, c, d, removeEdge);
            }
        }
    }

    private int countVisited(boolean[] visited) {
        int count = 0;
        for (boolean v : visited) if (v) count++;
        return count;
    }
}