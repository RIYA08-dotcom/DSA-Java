/*
Leetcode 875-Koko Eating Banana
Time Complexity-O(n log m)
Space Complexity-O(1)
Approach-
1.Use binary search on the possible eating speed.
2. Set low = 1 and high = maximum element in the piles array.
3. For every middle value (mid), calculate the total hours required if Koko eats mid bananas per hour.
4. If the required hours are less than or equal to h, then mid can be the answer, so search for a smaller valid speed by setting high = mid.
5. Otherwise, Koko needs to eat faster, so set low = mid + 1.
6. When the binary search ends, low will be the minimum eating speed.
*/

class Solution {
    int hour(int[]piles,int mid){
        int hours=0;
            for(int i=0;i<piles.length;i++){
                 hours+=(piles[i]+mid-1)/mid;

            }
            return hours;
           
        }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        while(low<high){
            int mid=low+(high-low)/2;
           int hours= hour(piles,mid);
            
           
                if(hours<=h){
                    high=mid;
                }
            else{
                
                    low=mid+1;
            }

        }
        return low;
      
        
    }
    
        int max(int[]piles){
            int maxEle=0;
            for(int i=0;i<piles.length;i++){
                if(piles[i]>maxEle)
                maxEle=piles[i];
            }
            return maxEle;
        }

}
