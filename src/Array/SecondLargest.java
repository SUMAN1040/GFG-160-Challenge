/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Array;

class Solution1 {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr){
            if (num > largest){
                secondLargest = largest;
                largest = num;
            } else if ( num > secondLargest && num < largest){
                secondLargest = num;
            }
        }
        return (secondLargest == Integer.MIN_VALUE)? -1: secondLargest;
    }
}