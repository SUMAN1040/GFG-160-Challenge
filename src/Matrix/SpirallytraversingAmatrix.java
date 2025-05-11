/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Matrix;

class Solution2 {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = mat.length;
        if (n == 0) return result;
        int m = mat[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) result.add(mat[top][i]);
            top++;

            for (int i = top; i <= bottom; i++) result.add(mat[i][right]);
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) result.add(mat[bottom][i]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) result.add(mat[i][left]);
                left++;
            }
        }

        return result;
    }
}