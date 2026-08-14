/*
leetcode 3090-Maximum Substring with two occurance
Time complexity-O(n)
Space complexity-O(1)
Approach-
1.we will use two pointer(left and right).
2.we will make a array of size 26.
3.traverse the string and convert the character values into index.
4.if frequency for a paticular character exceeds 2 then decrement the frequency of keft character and increment left.
5.update ans with valid maximum substring and return ans.


*/
class Solution {
    public int maximumLengthSubstring(String s) {
       
        int left=0;
        int right=0;
        int ans=0;
       
       int fre[]=new int[26];
       for(right=0;right<s.length();right++){
     
        fre[s.charAt(right)-'a']++;
        while(fre[s.charAt(right)-'a']>2){
           fre[ s.charAt(left)-'a']--;
           left++;
        }
        ans=Math.max(ans,right-left+1);


       }
       return ans;
}
}
