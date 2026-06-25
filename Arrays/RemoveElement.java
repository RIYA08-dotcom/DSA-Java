//Leetcode 27-Remove Element
//Time Complexity-O(n)
//Space Complexity-o(1)
//Approach-by using Two Pointer

class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        else{
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[j]=nums[i];
                    j++;

                }
                
            }
            return j;
        }
        
    }
}
