/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package RecursionandBacktracking;

class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> result = new ArrayList<>();
        boolean[] used = new boolean[s.length()];
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        backtrack(result, new StringBuilder(), chars, used);
        return result;
    }

    private void backtrack(ArrayList<String> result, StringBuilder temp, char[] chars, boolean[] used) {
        if (temp.length() == chars.length) {
            result.add(temp.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            temp.append(chars[i]);
            backtrack(result, temp, chars, used);
            used[i] = false;
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}