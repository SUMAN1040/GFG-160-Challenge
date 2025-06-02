/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package TwoPointerTechnique;

class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        if (n < 3) return 0;

        int[] left = new int[n];
        int[] right = new int[n];
        int water = 0;

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
        }

        return water;
    }
}

