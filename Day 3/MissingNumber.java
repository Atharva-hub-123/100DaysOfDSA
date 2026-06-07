// LeetCode 268 - Missing Number
// https://leetcode.com/problems/missing-number/description

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        int expectedSum = n * (n+1) / 2;
        
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        return expectedSum - sum;
    }
}