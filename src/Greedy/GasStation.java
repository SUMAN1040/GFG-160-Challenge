/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Greedy;

class Solution {
    public int startStation(int[] gas, int[] cost) {
        // Your code here
        int totalGas = 0;
        int totalCost = 0;
        int start = 0;
        int tank = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (totalGas < totalCost) return -1;

        return start;
    }
}