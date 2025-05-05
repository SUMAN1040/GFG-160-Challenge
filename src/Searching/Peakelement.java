/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Searching;

class Solution4 {

    public int peakElement(int[] arr) {
        // code here
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int left = (mid == 0) ? Integer.MIN_VALUE : arr[mid - 1];
            int right = (mid == arr.length - 1) ? Integer.MIN_VALUE : arr[mid + 1];

            if (arr[mid] >= left && arr[mid] >= right) {
                return mid;
            } else if (arr[mid] < right) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
