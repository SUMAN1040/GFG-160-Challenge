/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Heap;

class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = arr.length - 1; i >= arr.length - k; i--) res.add(arr[i]);
        return res;
    }
}