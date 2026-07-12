/*
Leetcode 40-Combination SumII
Timr Complexity-O(2^n*n)
Space Complexity-O(n)
Approach-
1.Sort the candidates array so that duplicate elements can be handled easily.
2.if target is zero then add current to the ans list and return.
3.if target becomes less than zero or index reaches to length of array,return.
4.traverse the array,if current element is equal to previous one at same recusrive level then skip it in order to avoid duplicate.
5.add that current element to current list.
6.call the helper function recursively with the reduced target and i+1.
7.exclude the last element from tha the ans list to backtack and explore other combinations.
*/
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,0,ans,current);
        return ans;


        
    }
    public void helper(int[] candidates, int target,int index, List<List<Integer>>ans, List<Integer>current){
        if(target==0){
            ans.add(new ArrayList<>(current));
            return;

        }
        if(target<0||index==candidates.length){
            return;
        }
        
       for(int i=index;i<candidates.length;i++){
        if(i>index&&candidates[i]==candidates[i-1]){
            continue;
        }
        
        current.add(candidates[i]);
        helper(candidates,target-candidates[i],i+1,ans,current);
        current.remove(current.size()-1);
       


       }
    }
}
