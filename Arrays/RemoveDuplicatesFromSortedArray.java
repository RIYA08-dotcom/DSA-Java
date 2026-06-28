//leetcode 26-Remove Duplicates from Sorted Array
//Time Complexity-0(n)
//Space complexity-O(1)
//Approach- A current element and its previous one  is comapered if they are same then it will be only taken once and then moves to next element 

class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
        
    }
}
