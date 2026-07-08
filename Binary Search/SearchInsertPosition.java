/*
Leetcode 35-Search Insert Position
Time complexity-O(log n)
Space Complexity-O(1)
Approach-
1.use binary search with two boundararies(low,High).
2.continue searching,when high is greater and equal to low, target is equal to value of mid then return the index of mid.
3.if target is greater than value of mid,update low by increament in mid.
4.if target is less than value of mid,update high by decreament in mid.
5.if target is not found then return low it will insert the value of target at its correct position.
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
        
    }
}
