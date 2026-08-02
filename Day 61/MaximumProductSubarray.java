// LeetCode 152 - Maximum Product Subarray
// https://leetcode.com/problems/maximum-product-subarray/description/

class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int maxProduct = nums[0];
        int minProduct = nums[0];

        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];

            if(curr < 0){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(curr, maxProduct * curr);
            minProduct = Math.min(curr, minProduct * curr);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}