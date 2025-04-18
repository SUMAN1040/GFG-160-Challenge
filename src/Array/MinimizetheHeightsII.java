/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Array;

class Solution9 {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        if (n == 1)
            return 0;

        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            int minVal = Math.min(smallest, arr[i + 1] - k);
            int maxVal = Math.max(largest, arr[i] + k);

            if (minVal < 0) continue;

            ans = Math.min(ans, maxVal - minVal);
        }

        return ans;
    }
}

