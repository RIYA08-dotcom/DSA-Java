/*
leetcode-Sort Colors
Time Complexity-O(n)
Space Complexity-O(1)
Approach-
1.use three-pointers(low,mid,high),mid refers to the current element.
2.traversing the array with a condition where mid is less than or equal to high.
3.if current element is zero then swap nums[mid] with nums[low],increament both mid and low.
4.if current element is one then increment mid only;
5.if current element is two then swap nums[high] with nums[mid],decrement the high.
*/

class Solution {
    public void sortColors(int[] nums){
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
              int temp=nums[mid];
              nums[mid]=nums[low];
              nums[low]=temp;
              mid++;
              low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
                

            }
        }
    }
