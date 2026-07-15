/*
/*
Leetcode 540 - Single Element in a Sorted Array

Time Complexity - O(log n)
Space Complexity - O(1)

Approach -
1. Use Binary Search with two pointers (low and high).
2. Find the middle index (mid).
3. If mid is odd:
   - If nums[mid] == nums[mid - 1], the single element lies on the right side, so update low = mid + 1.
   - Otherwise, it lies on the left side (including mid), so update high = mid.
4. If mid is even:
   - If nums[mid] == nums[mid + 1], the single element lies on the right side, so update low = mid + 2.
   - Otherwise, it lies on the left side (including mid), so update high = mid.
5. Continue until low == high.
6. Return nums[low], which is the single non-duplicate element.
*/

*/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(mid%2==1){

               if(nums[mid]==nums[mid-1]){
                low=mid+1;
               }
               else{
                high=mid-1;

               }
            }
            else{
                if(nums[mid]==nums[mid+1]){
                    low=mid+2;
                }
              else{
              high=mid-1;
              }
            }

        }
        return nums[low];
        
    }
}
