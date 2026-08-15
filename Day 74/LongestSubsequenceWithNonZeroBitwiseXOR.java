// LeetCode 3702. Longest Subsequence With Non-Zero Bitwise XOR
// https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/description/

class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean hasNonZero = false;

        for(int num: nums){
            xor ^= num;
            if(num != 0){
                hasNonZero = true;
            }
        }

        if(xor != 0) return nums.length;
        if(hasNonZero){
                return nums.length - 1;
        }

        return 0;
    }
}
