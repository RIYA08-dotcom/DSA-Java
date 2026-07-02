/*
Leetcode 15-Three Sum
Time Complexity-O(n^2)
Space Complexity-O(1) (excluding the output list)

Approach-
1. Given Array is sorted.
2.fix an element at a time.
3.use two-pointers(left and right) to find the remaining two elements.
4.If  valid triplet found,store it.
5.skip duplicates to avoid repeated triplets.
6. Move the pointers until all unique triplets are found.
  */
  
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                
                while(left<right && nums[left]==nums[left+1]){
                    left++;
                }
                while(left<right && nums[right]==nums[right-1]){
                    right--;
                }
                left++;
                right--;

            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }
            }


        }
        return ans;
      

        
    }
}
