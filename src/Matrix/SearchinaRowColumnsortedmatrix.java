/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Matrix;

class Solution1 {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int n = mat.length;
        int m = mat[0].length;
        int i = 0, j = m - 1;

        while (i < n && j >= 0) {
            if (mat[i][j] == x)
                return true;
            else if (mat[i][j] > x)
                j--;
            else
                i++;
        }
        return false;
    }
}
