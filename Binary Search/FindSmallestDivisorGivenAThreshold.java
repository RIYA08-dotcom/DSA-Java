/*
Leetcode(1283)-find smallest divisor given a threshold
Time Complexity-O(n log m)
Space Complexity-O(n)
Approach-
1.Set the search range:
 low = 1
 high = maximum element in the array
2.Perform Binary Search on the divisor.
3.For each mid (candidate divisor), calculate:
 sum += ceil(nums[i] / mid)
4.which can be computed efficiently using:
(nums[i] + mid - 1) / mid
5.If sum <= threshold, the current divisor is valid, so search for a smaller divisor (high = mid).
6.Otherwise, search in the larger half (low = mid + 1).
7.Return low.
*/
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=max(nums);
        int index=0;
      
        while(low<high){
              int sum=0;
            int mid=low+(high-low)/2;
            for(int i=0;i<nums.length;i++){

                int x=(nums[i]+mid-1)/mid;
                sum+=x;
            



            }
            
            if(threshold>=sum){
                high=mid;
            }
            else{
                low=mid+1;
            }
            

        }
        return low;
        
        
    }
    int max(int[] nums){
       int  maxel=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxel){
                maxel=nums[i];

            }
        }
        return maxel;
    }
}
