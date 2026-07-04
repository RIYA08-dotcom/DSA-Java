/*
Leetcode 75-Sort Colors
Time Complexity-O(n)
Space Complexity-O(1)
Approach-
1.Traverse the given array.
2.Count the number of 0s,1s and2s 
3.Overwrite the array with 0s,1s and 2s  in a sequence.
*/
class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }
             else if(nums[i]==1){
                count1++;
            }
             else{
                count2++;
            }
        }
        for(int i=0;i<count0;i++){
            nums[i]=0;
        }
        for(int i=count0;i<count0+count1;i++){
            nums[i]=1;
        }
        for(int i=count1+count0;i<count0+count1+count2;i++){
            nums[i]=2;
        }
        

        

        
    }
}
