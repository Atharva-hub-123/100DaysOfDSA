// LeetCode 1979 - Find Greatest Common Divisor of Array
// https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/

class Solution {
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public int findGCD(int[] nums) {
        int n = nums.length;
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            maximum = Math.max(maximum, nums[i]);
            minimum = Math.min(minimum, nums[i]);
        }

        return gcd(minimum, maximum);
    }
}
