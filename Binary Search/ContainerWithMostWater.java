/*
Leetcode (11)-Container with Most Water
Time Complexity-O(log n)
Space Complexity-O(1)
Approach-
1. Use two pointers: left at the beginning and right at the end.
2. In each iteration, calculate the width as (right - left).
3. The effective height is the minimum of height[left] and height[right].
4. Compute the current area = width × height and update the maximum area.
5. Move the pointer with the smaller height inward because moving the taller one cannot produce a larger area with the current width.
6. Continue until the two pointers meet.
7. Return the maximum area.
*/
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right){
            
                int width=right-left;
                int h=Math.min(height[left],height[right]);
                int area=width*h;
                 maxarea=Math.max(maxarea,area);

                 if(height[left]<height[right]){
                    left++;
                 }
                 else{
                    right--;
                    }

        }
        
        
        return maxarea;
    }
}
