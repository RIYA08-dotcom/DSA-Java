/*
Leetcode 33-Search in Rotated Sorted Array
Time Complexity-O(logn)
Space complexity-o(1)
Approach-
1. Apply Binary Search using two pointers (left and right).
2. Find the middle index.
3. If nums[mid] equals the target, return mid.
4. Check which half is sorted.
(these will be updated accordingly)
5. If the left half is sorted and the target lies within it, search the left half; otherwise search the right half.
6. If the right half is sorted and the target lies within it, search the right half; otherwise search the left half.
7. If the target is not found, return -1.
  */
class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return mid;

            }
            if(nums[mid]>=nums[left]){
                if(target>=nums[left]&&target<nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(target<=nums[right]&&target>nums[mid]){
                    left=mid+1;

                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
        
        
    }
}
