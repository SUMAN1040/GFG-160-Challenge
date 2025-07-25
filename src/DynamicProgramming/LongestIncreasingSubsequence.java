/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package DynamicProgramming;

class Solution {
    static int lis(int arr[]) {
        // code here
        ArrayList<Integer> seq = new ArrayList<>();
        for (int num : arr) {
            int idx = Collections.binarySearch(seq, num);
            if (idx < 0) idx = -idx - 1;
            if (idx == seq.size()) {
                seq.add(num);
            } else {
                seq.set(idx, num);
            }
        }
        return seq.size();
    }
}