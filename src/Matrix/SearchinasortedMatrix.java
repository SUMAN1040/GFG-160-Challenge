/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Matrix;

class Solution5 {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = n * m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;
            int midElement = mat[row][col];

            if (midElement == x) {
                return true;
            } else if (midElement < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
