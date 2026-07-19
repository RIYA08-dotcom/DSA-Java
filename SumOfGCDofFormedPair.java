/*
Leetcode 3867-Sum Of GCD of Formed Pairs.
Time Complexity-O(n log n)
Space Complexity-O(n)
Approach-
1.Traverse the array and keep track of the maximum element seen so far.
2. For every element, compute the GCD of the current element and the maximum value till that index.
3. Store these GCD values in a new array (prefixGcd).
4. Sort the prefixGcd array.
5. Use two pointers:
   - One at the beginning (left).
   - One at the end (right).
6. Add the GCD of the left and right elements to the answer, then move both pointers inward.
7. Continue until the pointers meet and return the final sum.
*/
import java.util.Arrays;

class Solution {

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];

        int mx = 0;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            prefixGcd[i] = gcd(nums[i], mx);
        }

        Arrays.sort(prefixGcd);

        long ans = 0;
        int left = 0, right = n - 1;

        while (left < right) {
            ans += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }

        return ans;
    }
}
