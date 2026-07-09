/*
Leetcode 39-Combination Sum
Time Complexity: O(N^(T/M))
Space Complexity: O(T/M)

Approach:

1.Use backtracking to find all possible combinations whose sum is equal to the target.
2.Start from the current index and try each candidate one by one.
3.If the current candidate is less than or equal to the remaining target, add it to the current combination.
4.Recursively call the function with the same index because the same element can be used multiple times.
5.After the recursive call, remove the last added element to backtrack and explore other possibilities.
6.If the remaining target becomes 0, add the current combination to the answer.
7.If the current candidate is greater than the remaining target, stop exploring that path.
*/
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(candidates,target,0,current,ans);
        return ans;

        
    }
    public void helper(int[] candidates,int target,int index,List<Integer> current,List<List<Integer>> ans){
       
        if(target==0){
             ans.add(new ArrayList<>(current));
             return;

        }
        if(target<0){
            return;
        }
        if(index==candidates.length){
            return;
        }
        //include
       current.add(candidates[index]);
        helper(candidates, target-candidates[index], index,current, ans);

        //backtrack
        current.remove(current.size()-1);

        //exclude
         helper(candidates, target, index+1,current, ans);


        

       

       



    }
}
