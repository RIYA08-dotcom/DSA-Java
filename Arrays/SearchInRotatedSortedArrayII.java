/*
Leetcode 81-Search In Rotated Sorted Array
Time Complexity-O(n) (worst case)
Space Complexity-O(1)
Approach-
1.if target is equals to mid,return true.
2.if nums of mid,left and right are equal then increment the left,decrement in right and skip.
3.if middle index element is greater than left index element also target lies between the nums[left] and nums[mid] then right becomes mid-1.
4.otherwise left becomes mid+1.
5.if target lies between the nums[mid] and nums[right] then left becomes mid+1 otherwise right becomes mid-1.
6.at last return false i.e target is not found 
*/
class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return true;
            }
            if(nums[left]==nums[mid]&&nums[mid]==nums[right]){
                left++;
                right--;
                continue;
            }
            if(nums[mid]>=nums[left]){
                if(nums[mid]>target&&nums[left]<=target){
                    right=mid-1;
                }
                else{
                    left=mid+1;

                }
            }
            else{
                if(target>nums[mid]&&target<=nums[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return false;
        
    }
}
