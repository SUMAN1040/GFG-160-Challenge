/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package TwoPointerTechnique;

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int left = 0, right = arr.length - 1, count = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                if (arr[left] == arr[right]) {
                    int n = right - left + 1;
                    count += n * (n - 1) / 2;
                    break;
                }
                int lCount = 1, rCount = 1;
                while (left + 1 < right && arr[left] == arr[left + 1]) {
                    lCount++;
                    left++;
                }
                while (right - 1 > left && arr[right] == arr[right - 1]) {
                    rCount++;
                    right--;
                }
                count += lCount * rCount;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}