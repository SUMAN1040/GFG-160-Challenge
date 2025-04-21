/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package String;

class Solution5 {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> result = new ArrayList<>();
        int M = pat.length(), N = txt.length();
        int[] lps = computeLPSArray(pat);
        int i = 0, j = 0;

        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++; j++;
            }
            if (j == M) {
                result.add(i - j);
                j = lps[j - 1];
            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
        return result;
    }

    int[] computeLPSArray(String pat) {
        int M = pat.length();
        int[] lps = new int[M];
        int len = 0, i = 1;
        lps[0] = 0;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i++] = len;
            } else {
                if (len != 0) len = lps[len - 1];
                else lps[i++] = 0;
            }
        }
        return lps;
    }
}
