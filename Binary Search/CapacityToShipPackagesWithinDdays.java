/*
Leetcode 1011-Capacity To Ship Packages Within D Days
Time Complexity-O(n log m)
Space Complexity-O(1)
Approach-
1.we will use two-pointers(low,high) to apply binary search.
2.Initially both low and high will be initialised with zero but later low will store the maximum weight and high will store the sum of all weights.
3.also initialise variable named currentWeight with 0 and requiredDays with 1.
4.traverse the array if sum of currentWeught and weight is greater than mid then increase the requiredDays and currentWeight becomes weight.
5.otherwise update currentWeight by adding wight to currentWeight.
6.if requiredDays<=days then high=mid; otherwise low=mid+1;
7.return low.
*/
class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            int currentWeight = 0;
            int requiredDays = 1;

            for (int weight : weights) {
                if (currentWeight + weight > mid) {
                    requiredDays++;
                    currentWeight = weight;
                } else {
                    currentWeight += weight;
                }
            }

            if (requiredDays <= days) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
