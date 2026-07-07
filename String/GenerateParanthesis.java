/*
Leetcode 22-Generate Paranthesis
Time Complexity-O(4^n/sqrt(n))
Space Complexity-O(n)
Approach-
1.total length of the current is twice of n,add current to the ans list.
2.open parentheses should be less than n then add  "(" and recursively continue.
3.close parentheses should be less than open parentheses ,add close bracket")" and recursively continue.
4.These conditions ensure that only valid parentheses combinations are generated.   
*/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        
        helper(n,"",ans,0,0);
        return ans;       
    }
    public void helper(int n,String current,List<String>ans,int open,int close){
        if(current.length()==n*2){
            ans.add(current);
            return;
        }
        if(open<n){
            helper(n,current+"(",ans,open+1,close);
        }
        if(close<open){
             helper(n,current+")",ans,open,close+1);
        }
    }
}
