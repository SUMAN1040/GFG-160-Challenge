/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Greedy;

// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        int n = arr.length;
        int platforms = 0, maxPlatforms = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) { //
                platforms++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
                i++;
            } else {
                platforms--;
                j++;
            }
        }
        return maxPlatforms;
    }

    // Testing
    public static void main(String[] args) {
        int arr1[] = {900, 940, 950, 1100, 1500, 1800};
        int dep1[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr1, dep1));

        int arr2[] = {900, 1235, 1100};
        int dep2[] = {1000, 1240, 1200};
        System.out.println(findPlatform(arr2, dep2));

        int arr3[] = {1000, 935, 1100};
        int dep3[] = {1200, 1240, 1130};
        System.out.println(findPlatform(arr3, dep3));
    }
}
