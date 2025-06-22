/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package RecursionandBacktracking;

class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == word.charAt(0)) {
                    if (dfs(mat, word, i, j, 0, visited)) return true;
                }
            }
        }
        return false;
    }

    static boolean dfs(char[][] mat, String word, int i, int j, int idx, boolean[][] visited) {
        if (idx == word.length()) return true;
        if (i < 0 || i >= mat.length || j < 0 || j >= mat[0].length || visited[i][j] || mat[i][j] != word.charAt(idx)) {
            return false;
        }

        visited[i][j] = true;

        boolean found = dfs(mat, word, i + 1, j, idx + 1, visited) ||
                dfs(mat, word, i - 1, j, idx + 1, visited) ||
                dfs(mat, word, i, j + 1, idx + 1, visited) ||
                dfs(mat, word, i, j - 1, idx + 1, visited);

        visited[i][j] = false;

        return found;
    }
}

