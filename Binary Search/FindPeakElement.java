/*
Leetcode 162-Find Peak Element
Time Complexity-O(log n)
Space Complexity-O(1)
Approach-
1.use two-pointer (left,right) to perform binary search.
2.find the middle index.
3.if middle index element is smaller than next element which means peak element will found at right side so that left becomes mid+1.
4.otherwise right becomes mid.
5.at last return left.
*/

class Solution {
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
        
    }
}
