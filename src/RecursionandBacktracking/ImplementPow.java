/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package RecursionandBacktracking;

// User function Template for Java
class Solution {
    double power(double b, int e) {
        // code here
        boolean negative = e < 0;
        long exp = Math.abs((long)e);
        double result = 1.0;
        while (exp > 0) {
            if ((exp & 1) == 1) result *= b;
            b *= b;
            exp >>= 1;
        }
        return negative ? 1.0 / result : result;
    }
}