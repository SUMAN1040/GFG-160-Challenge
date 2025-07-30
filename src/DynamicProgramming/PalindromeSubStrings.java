/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package DynamicProgramming;

class Solution {
    public int countPS(String s) {
        // code here
        int n = s.length(), count = 0;
        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 >= 2) count++;
                left--;
                right++;
            }
        }
        return count;
    }
}