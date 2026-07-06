/*
Leetcode 47-PermutationsII
Time Complexity-O(n*n!)
Space Complexity-O(n)
Approach-
1.sort the given array.
2.if length of given array and size of current is same then add current into the ans list.
3.traverse the array.
4.if the current index is already used in current permutation,skip it.
5.If nums[i] is equal to nums[i-1] and the previous duplicate has not been used in the current recursion path, skip nums[i] to avoid duplicate permutations.
6.add current element nums[i] to the current list and update used[i] with true so that it can't be used in current permutaion.
7. call helper function recursively and delete the last element by backtracking.
8.update used[i] with false so that it can be used for other permutations.
*/

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        Arrays.sort(nums);
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
            else  if(i>0&&nums[i]==nums[i-1]&&used[i-1]==false){
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
