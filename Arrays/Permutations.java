/*
Leetcode 46-Permutations
Time Complexity-O(n*n!)
Space Complexity-O(n)
Approach-
1. a new array(used) of boolean type is initialised.
2.current will be added to ans when length of nums and current'size is equal.
3.traverse the nums array.
4.if currrent element used[i] is already used then it will bw skipped
5.otherwise,that element will be added to current and used[i] will updated to true so that it cannot be used in same permutaion again.
6.helper function is called recursively to generate further permutation and last added element will be removed during backtracking.
7.current element used[i] will again updated to false so that it can be used in other combinations.
*/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        helper(nums,ans,current,used);
        return ans;


        
    }
    public void helper(int[] nums, List<List<Integer>>ans,List<Integer>current,boolean[] used){
        if(nums.length==current.size()){
            ans.add(new ArrayList<>(current));
            return;

        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==true){
                continue;
            }
            
                current.add(nums[i]);
                used[i]=true;
                 helper(nums,ans,current,used);
           current.remove(current.size()-1);
           used[i]=false;
            

        }
       
    }
}
