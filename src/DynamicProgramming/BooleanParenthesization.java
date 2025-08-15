/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package DynamicProgramming;

// User function Template for Java
class Solution {
    static int countWays(String s) {
        // code here
        int n = s.length();
        int[][] T = new int[n][n];
        int[][] F = new int[n][n];
        for (int i = 0; i < n; i += 2) {
            T[i][i] = (s.charAt(i) == 'T') ? 1 : 0;
            F[i][i] = (s.charAt(i) == 'F') ? 1 : 0;
        }
        for (int len = 3; len <= n; len += 2) {
            for (int i = 0; i <= n - len; i += 2) {
                int j = i + len - 1;
                for (int k = i + 1; k < j; k += 2) {
                    char op = s.charAt(k);
                    int tik = T[i][k - 1] + F[i][k - 1];
                    int tkj = T[k + 1][j] + F[k + 1][j];
                    if (op == '&') {
                        T[i][j] += T[i][k - 1] * T[k + 1][j];
                        F[i][j] += (tik * tkj - T[i][k - 1] * T[k + 1][j]);
                    } else if (op == '|') {
                        F[i][j] += F[i][k - 1] * F[k + 1][j];
                        T[i][j] += (tik * tkj - F[i][k - 1] * F[k + 1][j]);
                    } else if (op == '^') {
                        T[i][j] += T[i][k - 1] * F[k + 1][j] + F[i][k - 1] * T[k + 1][j];
                        F[i][j] += T[i][k - 1] * T[k + 1][j] + F[i][k - 1] * F[k + 1][j];
                    }
                }
            }
        }
        return T[0][n - 1];
    }
}