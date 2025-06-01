/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package TwoPointerTechnique;

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        int maxLen = 0, left = 0;
        int[] index = new int[26];
        for (int i = 0; i < 26; i++) index[i] = -1;
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            if (index[ch - 'a'] >= left) {
                left = index[ch - 'a'] + 1;
            }
            index[ch - 'a'] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}