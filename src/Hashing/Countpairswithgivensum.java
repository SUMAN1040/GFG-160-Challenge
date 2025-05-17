/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Hashing;

class Solution {
    int countPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            count += map.getOrDefault(target - num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}

