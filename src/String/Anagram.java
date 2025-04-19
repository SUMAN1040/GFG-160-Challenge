/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package String;

class Solution3 {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
