/*
Leetcode-3727
TC-O(n log n)
SC-O(n)
Approach:
1.Square every element: Convert each element into its square.
2.Sort the array: Arrange the squared values in ascending order.
3.Find the midpoint: Divide the sorted array into two halves.
4.Subtract the smaller half: Subtract the elements from index 0 to mid - 1.
5.Add the larger half: Add the elements from index mid to n - 1.
  */
  
class Solution {
public long maxAlternatingSum(int[] nums) {
int n = nums.length;


    for (int i = 0; i < n; i++) {
        nums[i] *= nums[i];
    }

    Arrays.sort(nums);

    long ans = 0;
    int mid = n / 2;

    for (int i = 0; i < mid; i++) {
        ans -= nums[i];
    }

    for (int i = mid; i < n; i++) {
        ans += nums[i];
    }

    return ans;
}


}
