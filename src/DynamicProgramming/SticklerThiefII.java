/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package DynamicProgramming;

class Solution {
    int maxValue(int[] arr) {
        // code here
        int n = arr.length;
        if (n == 1) return arr[0];

        int max1 = robLinear(arr, 0, n - 2);
        int max2 = robLinear(arr, 1, n - 1);

        return Math.max(max1, max2);
    }

    private int robLinear(int[] arr, int start, int end) {
        int prev = 0, curr = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(curr, prev + arr[i]);
            prev = curr;
            curr = temp;
        }
        return curr;
    }
}