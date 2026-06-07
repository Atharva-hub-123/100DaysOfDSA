// LeetCode 2574 - Left and Right Sum Differences
// https://leetcode.com/problems/left-and-right-sum-differences/description/

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int result[] = new int[n];

        for(int num: nums){
            sum += num;
        }

        int leftSum = 0;
        for(int i = 0; i < n; i++){
            int rightSum = sum - leftSum - nums[i];
            result[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return result;
    }
}

