/*
Leetcode 4039 9sum of decoded numbers)
Time Complexity: O(n × (D + log Y))
Space Complexity: O(1) auxiliary space
Approach:
1. Traverse the array and extract `width` and `d` from each encoded number.
2. Count the number of digits in `d` using a helper variable. Repeatedly divide it by 10 until it becomes zero.
3. Calculate `divi = count - width` to determine where to split `d`.
4. Calculate `divisor = 10^divi`, then obtain `x = d / divisor` and `y = d % divisor`.
5. Use the `power()` function to calculate `x^y % MOD` efficiently.
6. Add each decoded value to `sum`, taking modulo `MOD` after every addition.
7. Return the final sum.
The `power()` function uses Binary Exponentiation. If `y` is odd, multiply `ans` by `x`. Then square `x` and divide `y` by 2 until `y` becomes zero.

## Complexity

- **
*/
class Solution {
    public int sumDecoded(long[] nums) {
        long sum=0;
           long MOD = 1000000007L;
        for(int i=0;i<nums.length;i++){
            int width=(int)(nums[i]%10);
            long d=(nums[i]/10);
            int count=0;
            long helper=d;
            while(helper!=0){
                count++;
                helper/=10;

            }
            int divi=count-width;
            long divisior=(long)Math.pow(10,divi);
            long x=(d/divisior);
            long  y=d%divisior;
            long decoded=power(x,y,MOD);
            sum = (sum + decoded) % MOD;

        }
        
        return (int)sum;
    }
     public long power(long x, long y, long MOD) {

        long ans = 1;
        x = x % MOD;

        while (y > 0) {

            if (y % 2 == 1) {
                ans = (ans * x) % MOD;
            }

            x = (x * x) % MOD;
            y = y / 2;
        }

        return ans;
    }
}
