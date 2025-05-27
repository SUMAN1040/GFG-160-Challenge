/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package TwoPointerTechnique;

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        if (arr == null || arr.length < 2) return new ArrayList<>();
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int a = 0, b = 0;
        boolean found = false;
        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(target - sum);
            if (diff < minDiff) {
                minDiff = diff;
                a = arr[left];
                b = arr[right];
                found = true;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        if (!found) return new ArrayList<>();
        return Arrays.asList(a, b);
    }
}