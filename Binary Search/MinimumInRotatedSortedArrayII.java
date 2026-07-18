/*
Leetcode 154-Find Minimum In Rotated Sorted Array II
Time Complexity-O( Log n) (average)
Space Complexity-O(1)
Approach-
1.two-pointers will be used(low,high)
2.if nums[mid] is greater than nums[high] then surely minimum element will be in right side soo low becomes mid+1.
3.if both the elements are equal then decreament the high.
4.otherwise update high with mid because minimum element will be found in left side.
5.return nums[low] because it will be the minimum element after rotation.

*/
class Solution {
    public int findMin(int[] nums) {
      
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[high]<nums[mid]){
                 low=mid+1;

            }
            else if(nums[mid]==nums[high]){
                high--;
                
                

            }
            else{
                high=mid;
                
            }

       }
        return nums[low];
    }
}
