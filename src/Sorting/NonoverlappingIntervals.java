/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Sorting;

class Solution6 {
    static int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                return a[1] - b[1];
            }
        });

        int count = 0;
        int lastEnd = Integer.MIN_VALUE;

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] < lastEnd) {
                count++;
            } else {
                lastEnd = intervals[i][1];
            }
        }

        return count;
    }
}