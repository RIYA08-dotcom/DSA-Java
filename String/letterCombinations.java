/*
Leetcode 17-letter Combinations of a Phone Number
Time Complexity-O(4^n*n)
Space Complexity-O(n)
Approach-
1. Create a mapping of digits (2–9) to their corresponding letters.
2. If the input string is empty, return an empty list.
3. Use backtracking to generate all possible letter combinations.
4. For the current digit, iterate through all its mapped letters.
5. Append one letter to the current string.
6. Recursively process the next digit.
7. Backtrack by removing the last appended character.
8. When all digits are processed, add the current combination to the answer list.
*/
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        StringBuilder current=new StringBuilder();
        if(digits.length()==0){
            return ans;

        }
        helper(digits,0,ans,current);
        
        return ans;
        
    }
    public void helper(String digits,int index,List<String>ans,StringBuilder current){
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       
        
        if(index==digits.length()){
            ans.add(current.toString());
            return;
        }
         String letters=map[digits.charAt(index)-'0'];
       for(int i=0;i<letters.length();i++){
        current.append(letters.charAt(i));
        helper(digits,index+1,ans,current);
        current.deleteCharAt(current.length()-1);

        

       }
    }
}
