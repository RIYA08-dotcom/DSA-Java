//Leetcode 9-Palindrome
//Time Complexity-O(log n)
//Space Complexity-O(log n)
//Approach-first reverse the number recurcively and then comapre with original number
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        return x==reverse(x,0);
       
        
    }
    int reverse(int x,int rev){
         if(x==0){
            return rev;
        }
        int ld=x%10;
        rev=rev*10+ld;
        return reverse(x/10,rev);
    }
}
