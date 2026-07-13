// LeetCode 238 - Product of Array Except Self
// https://leetcode.com/problems/product-of-array-except-self/description/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        int prefix = 1;
        for(int i = 0; i < nums.length; i++){
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
         for(int i = n-1; i >= 0; i--){
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;

    }
}