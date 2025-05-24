/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Hashing;

class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int xorr = 0;
        long count = 0;

        for (int i = 0; i < arr.length; i++) {
            xorr ^= arr[i];
            if (xorr == k) {
                count++;
            }
            int required = xorr ^ k;
            if (map.containsKey(required)) {
                count += map.get(required);
            }
            map.put(xorr, map.getOrDefault(xorr, 0) + 1);
        }

        return count;
    }
}