// LeetCode 3982 - Sum of Integers with Maximum Digit Range
// https://leetcode.com/problems/sum-of-integers-with-maximum-digit-range/

class Solution {
    public int maxDigitRange(int[] nums) {
        int maxDigitRange = Integer.MIN_VALUE;
        int n = nums.length;
        int digitRange[] = new int[n];
        int ans = 0;

        for(int i = 0; i < n; i++){
            int curr = nums[i];
            int maxDigit = Integer.MIN_VALUE;
            int minDigit = Integer.MAX_VALUE;

            if(curr == 0){
                maxDigit = 0;
                minDigit = 0;
            }
            
            while(curr > 0){
                int digit = curr % 10;
                maxDigit = Math.max(maxDigit, digit);
                minDigit = Math.min(minDigit, digit);
                curr /= 10;
            }
            maxDigitRange = Math.max(maxDigitRange, maxDigit - minDigit);
            digitRange[i] = maxDigit - minDigit;
        }

        for(int i = 0; i < n; i++){
            if(digitRange[i] == maxDigitRange){
                ans += nums[i];
            }
        }

        return ans;
    }
}