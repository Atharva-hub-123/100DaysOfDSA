// LeetCode 3903 - Smallest Stable Index I
// https://leetcode.com/problems/smallest-stable-index-i/description/

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length == 0){
            return -1;
        }

        int n = nums.length;

        int scores[] = new int[n];
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for(int i = n - 1; i >= 0; i--){
            minimum = Math.min(minimum, nums[i]);
            scores[i] = minimum;
        }

        for(int i = 0; i < nums.length; i++){
            maximum = Math.max(maximum, nums[i]);
            scores[i] = maximum - scores[i];

            if(scores[i] <= k){
                return i;
            }
        }

        return -1;
    }
}