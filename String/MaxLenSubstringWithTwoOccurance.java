/*
leetcode 3090- maximum length substring with two Occurances
Time Complexity-O(n)
Space Complexity-O(1)
Approach-
1.we will use two pointers(left and right)
2.create a hashmap which will add the character at the right pointer to the HashMap.
3.traverse the whole string and count the frequency for each character.
4.if the frequency of particular character exceeds more than 2, exclude the first letter in left and decrease its frequency.
5.then increament  left by 1.
6.update the ans with longest valid substring and return ans.


*/

class Solution {
    public int maximumLengthSubstring(String s) {
       
        int left=0;
        int right=0;
        int ans=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for( right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
        
        while(map.get(s.charAt(right))>2){
            map.put(s.charAt(left),map.get(s.charAt(left))-1);
            
            left++;
            
        }
        ans=Math.max(ans,right-left+1);

        }
        return ans;
               
    
    }
}
