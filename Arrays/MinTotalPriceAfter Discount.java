/*
Leetcode-4014
Approach: Greedy + Sorting
1. First, sort both the `prices` and `discounts` arrays in ascending order.
2. Initialize `sum = 0` and calculate the lengths of both arrays.
3. Iterate through the last `min(m, n)` elements of both arrays, pairing the highest price with the highest discount.
4. Calculate the discounted price using the formula:
   `price * (100 - discount) / 100.0`
5. Add the discounted prices to `sum`.
6. If there are more prices than discounts, add the remaining prices without applying any discount.
7. Return the final sum.


Time Complexity: O(n log n + m log m)
* Sorting `prices` takes O(n log n).
* Sorting `discounts` takes O(m log m).
* The loops together take O(n + m).
Therefore, the overall time complexity is **O(n log n + m log m)**.

 Space Complexity: O(log n + log m)
Assuming the sorting implementation uses O(log n) and O(log m) auxiliary stack space, respectively, and the sorting is performed in place.
Therefore, the auxiliary space complexity is **O(log n + log m)**.

*/

class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(discounts);
        Arrays.sort(prices);
        double sum=0;
        int m=discounts.length;
        int n=prices.length;
        for(int i=0;i<Math.min(m,n);i++){
           int price=prices[n-i-1];
            int discount=discounts[m-i-1];
            sum+=(price*(100-discount))/100.0;
            
            
        }
        for(int i=0;i<n-Math.min(m,n);i++){
            sum+=prices[i];
           
        }
        
        
        
      
        return sum;
    }
}
