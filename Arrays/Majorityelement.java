//leetcode 169-Majority element
//Tme Complexity-O(n)
//Space Complexity-O(1)
//Approach-Boyre-Moore Voting Algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(candidate==num){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
        
    }
}
