/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package PrefixSum;

class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = -1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0, sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}