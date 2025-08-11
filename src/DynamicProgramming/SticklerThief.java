/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package DynamicProgramming;

class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        if (arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];
        int prev2 = arr[0], prev1 = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            int curr = Math.max(prev1, prev2 + arr[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}