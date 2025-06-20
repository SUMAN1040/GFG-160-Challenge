/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package RecursionandBacktracking;

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solve(0, n, new ArrayList<>(), new boolean[n], new boolean[2 * n], new boolean[2 * n], result);
        return result;
    }

    private void solve(int col, int n, ArrayList<Integer> temp, boolean[] rows, boolean[] d1, boolean[] d2, ArrayList<ArrayList<Integer>> result) {
        if (col == n) {
            ArrayList<Integer> board = new ArrayList<>();
            for (int r : temp) board.add(r + 1);
            result.add(new ArrayList<>(board));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (!rows[row] && !d1[row - col + n] && !d2[row + col]) {
                rows[row] = d1[row - col + n] = d2[row + col] = true;
                temp.add(row);
                solve(col + 1, n, temp, rows, d1, d2, result);
                temp.remove(temp.size() - 1);
                rows[row] = d1[row - col + n] = d2[row + col] = false;
            }
        }
    }
}