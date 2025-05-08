/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Searching;

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        if (arr.length < k) return -1;

        int low = getMax(arr);
        int high = getSum(arr);
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private static boolean isPossible(int[] arr, int k, int maxPages) {
        int students = 1, sum = 0;
        for (int pages : arr) {
            if (pages > maxPages) return false;
            if (sum + pages > maxPages) {
                students++;
                sum = pages;
                if (students > k) return false;
            } else {
                sum += pages;
            }
        }
        return true;
    }

    private static int getMax(int[] arr) {
        int max = 0;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}