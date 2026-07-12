/*
Leetcode 153-Find Minimum In Rotated SortedArray
Time Complexity-O(log n)
Space Complexity-O(1)
Approach-
1.two-pointers(left,right) will be used.
2.find mid,if element at mid greater than element at right then update left with left=mid.
3.otherwise update right with mid-1.
4.Continue until left becomes equal to right.
5.Return nums[left] as the minimum element.
*/
class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[right]<nums[mid]){
                left=mid+1;
            }
            else{
                right=mid;
            }

        }
        return nums[left];
        
    }
}
