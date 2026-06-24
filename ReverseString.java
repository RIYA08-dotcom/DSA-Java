//leetcode 344-Reverse String
//Time complexity-O(n)
//Space Complexity-O(1)
//Approach-Two pointer and then Swapping is used
class Solution {
    public void reverseString(char[] s) {
       
        int left=0,right=s.length - 1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        
        }
       
    }
}
