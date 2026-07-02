/*
Leetcode 20-Valid Parentheses
Time Complexity-O(n)
Space Complexity-O(n)
Approach-
1.Traverse each Character of the String.
2.if there are opening brackets('(','[','{') then push it onto stack.
3.Otherwiseif the Stack is empty, return false.
4.Pop the top element from the Stack.
5. If the popped opening bracket does not match the current closing bracket, return false.
6. After traversing the entire string, return true only if the stack is empty



  */

class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for( char ch:s.toCharArray()){
            if( ch=='('||ch=='{'||ch=='['){
                st.push(ch);
                
            }
            else{
                if(st.isEmpty())
                return false;
                char top=st.pop();
                if( ch==')'&&top!='('||ch=='}'&&top!='{'||ch==']'&&top!='['){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
