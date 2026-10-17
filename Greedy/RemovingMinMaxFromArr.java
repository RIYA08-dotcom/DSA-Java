/*
Leetcode 2091
Time Complexity: O(n) — We traverse the array once to find the minimum and maximum indices. Calculating the three cases takes constant time.
Space Complexity: O(1) — We use only a constant number of extra variables.

Approach
1.First, we will initialize minIdx and maxIdx with 0. Then, we will traverse the given array to find the indices of the minimum and maximum elements.
2.After finding both indices, we will initialize leftIdx with the minimum of minIdx and maxIdx, and rightIdx with the maximum of minIdx and maxIdx.
3.Now, we will consider three cases:
   --Deletion from the left: We will delete all elements from the beginning up to rightIdx. Therefore, the number of deletions will be rightIdx + 1.
   --Deletion from the right: We will delete all elements from the end up to leftIdx. Therefore, the number of deletions will be n - leftIdx.
   --Deletion from both left and right: We will delete elements from the beginning up to leftIdx and from the end starting at rightIdx. 
     Therefore, the total number of deletions will be (leftIdx + 1) + (n - rightIdx).
4.Finally, we will calculate the minimum among these three cases and return it as the answer.

*/

class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minIdx=0;
        int maxIdx=0;
        for(int i=0;i<n;i++){
           if(nums[i]<nums[minIdx]){
            minIdx=i;
           }
             if(nums[i]>nums[maxIdx]){
            maxIdx=i;
           }


        }
       int ans=0;
      int  leftIdx=Math.min(minIdx,maxIdx);
      int  rightIdx=Math.max(maxIdx,minIdx);
       
         //case 1--daletion from left
         int left=rightIdx+1;
         //case2--deletion from right
         int right=n-leftIdx;
         //case 3-- deletion from both left and right
         int both=(leftIdx+1)+(n-rightIdx);
            ans=Math.min(left,Math.min(right,both));
        
        return ans;
        

        
        
    }
}
