/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Graph;

class Solution {

    public int minCost(int[][] houses) {
        // code here
        int n = houses.length;
        boolean[] visited = new boolean[n];
        int cost = 0;
        int count = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 0});

        while (count < n) {
            int[] curr = pq.poll();
            int c = curr[0];
            int i = curr[1];

            if (visited[i]) continue;
            visited[i] = true;
            cost += c;
            count++;

            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    int dist = Math.abs(houses[i][0] - houses[j][0]) +
                            Math.abs(houses[i][1] - houses[j][1]);
                    pq.offer(new int[]{dist, j});
                }
            }
        }

        return cost;
    }
}
