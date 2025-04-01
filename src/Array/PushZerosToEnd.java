/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Array;

class Solution2 {
    void pushZerosToEnd(int[] arr) {
        // code here
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
}