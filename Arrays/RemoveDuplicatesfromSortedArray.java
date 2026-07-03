/*
Leetcode 26-Remove Duplicates from Sorted Array
Time Complexity-O(n)
Space Complexity-O(1)
Approach-
1.Transverse the given sorted array  array 
2.compare the current element and the previous element.
3. If both elements are different, place the current element at index j and increment j.
4. Continue until the end of the array.
5. Return j, which represents the number of unique elements.
*/
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
