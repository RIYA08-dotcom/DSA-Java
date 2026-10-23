/*
Leetcode 1143
TC-O(m*n)
SC-O(m*n)
Approach-Recursion + Memoization (Top-Down DP)

1.If either string becomes empty, return 0.
2.If the result for the current state is already computed,
return the memoized value.
3.If the last characters match, add 1 and move both pointers
backward.
4.If they don't match, explore both possibilities:
  ...Skip the last character of text1.
  ...Skip the last character of text2.
  ...Take the maximum of both results.
*/

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
          int m=text1.length();
        int n=text2.length();
        int[][] memo=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
           Arrays.fill(memo[i],-1);
        }
        return helper(text1,text2,m,n,memo);
        
    
    }
    int helper(String text1,String text2,int m,int n,int[][]memo){
        if(m==0||n==0){
            return 0;
        }
        if(memo[m][n]!=-1){
            return memo[m][n];
        }
        if(text1.charAt(m-1)==text2.charAt(n-1)){
            return memo[m][n]=1+helper(text1,text2,m-1,n-1,memo);
        }
        else{
            return memo[m][n]=Math.max(helper(text1,text2,m,n-1,memo),helper(text1,text2,m-1,n,memo));
        }


      
    }
}
