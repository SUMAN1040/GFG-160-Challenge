/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Graph;

class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int n = grid.length, m = grid[0].length, count = 0;
        boolean[][] visited = new boolean[n][m];
        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'L' && !visited[i][j]) {
                    dfs(grid, visited, i, j, dx, dy);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, boolean[][] visited, int x, int y, int[] dx, int[] dy) {
        visited[x][y] = true;
        for (int d = 0; d < 8; d++) {
            int nx = x + dx[d], ny = y + dy[d];
            if (nx >= 0 && ny >= 0 && nx < grid.length && ny < grid[0].length &&
                    grid[nx][ny] == 'L' && !visited[nx][ny]) {
                dfs(grid, visited, nx, ny, dx, dy);
            }
        }
    }
}