/*
Leetcode 724-Find Pivot Index
Time Copmplexity-O(n)
Space Complexity-O(1)
Approach-
1.traverse the given array and find the total sum of all elemnets of the array.
2.traverse again to find the right side sum by a derived formula i.e.(Rightsum=Total_sum-leftsum-Nums[i]).
3.if leftsum equals to rightsum,return the index of that element.
4.otherwise update the leftsum.
*/
class Solution {
    public int pivotIndex(int[] nums) {
        int total_sum=0;
        int leftsum=0;
       
        for(int i=0;i<nums.length;i++){
            total_sum+=nums[i];
           
        }
        for(int i=0;i<nums.length;i++){
             int rightsum=total_sum-leftsum-nums[i];
               if(rightsum==leftsum){
                return i;
            }
            else{
                leftsum+=nums[i];
            }

           }          


          
        return -1;
        
        
    }
}
