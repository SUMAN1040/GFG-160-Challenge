/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Searching;

class Solution8 {
    public int kthMissing(int[] arr, int k) {
        // code here
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return k + left;
    }
}