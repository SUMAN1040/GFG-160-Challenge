/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Graph;

class Solution {
    public int orangesRotting(int[][] mat) {
        // Code here
        int n = mat.length, m = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0, time = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 2) {
                    q.add(new int[]{i, j, 0});
                } else if (mat[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1], t = cur[2];
            time = Math.max(time, t);

            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && mat[nr][nc] == 1) {
                    mat[nr][nc] = 2;
                    fresh--;
                    q.add(new int[]{nr, nc, t + 1});
                }
            }
        }

        return (fresh == 0) ? time : -1;
    }
}