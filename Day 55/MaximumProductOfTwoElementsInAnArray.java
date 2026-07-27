// LeetCode 1464 - Maximum Product of Two Elements in an Array
// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/

class Solution {
    public int maxProduct(int[] nums) {
        int first = 0;
        int second = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= first){
                second = first;
                first = nums[i];
            }
            else if(nums[i] > second){
                second = nums[i];
            }
        }
        return (first - 1) * (second - 1);
    }
}
