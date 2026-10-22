/*
1.Base Case:
If the length of either string becomes zero, return 0 because
an empty string cannot have a common subsequence with another string.
2.If the last characters match:
Include that character in the common subsequence and return
1 + lcs(text1, text2, m-1, n-1).

3.If the last characters do not match:
Explore both possibilities:
 a) Exclude the last character of text2.
 b) Exclude the last character of text1.

Return the maximum of:
lcs(text1, text2, m, n-1)
and
lcs(text1, text2, m-1, n).

Time Complexity: Exponential in the worst case.
Space Complexity: O(m+n) due to the recursion stack.
*/
  */
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
       int  m=text1.length();
     int   n=text2.length();
        int commsub=lcs( text1,text2,m,n);
        return commsub;
        
    }
    int lcs(String text1, String text2,int m,int n){
       
        if(m==0||n==0){
            return 0;
        }
        if(text1.charAt(m-1)==text2.charAt(n-1)){
            return 1+lcs(text1,text2,m-1,n-1);
        }
        else{
           int maxlcs= Math.max(lcs(text1,text2,m,n-1),lcs(text1,text2,m-1,n));
           return maxlcs;
        }
    }
}
