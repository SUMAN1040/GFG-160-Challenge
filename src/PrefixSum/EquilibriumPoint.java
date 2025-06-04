/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package PrefixSum;

class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int totalSum = 0, leftSum = 0;
        for (int val : arr) totalSum += val;
        for (int i = 0; i < arr.length; i++) {
            if (leftSum == totalSum - leftSum - arr[i]) return i;
            leftSum += arr[i];
        }
        return -1;
    }
}