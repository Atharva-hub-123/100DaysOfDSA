// LeetCode 3867 - Sum of GCD of Formed Pairs
// https://leetcode.com/problems/sum-of-gcd-of-formed-pairs/description

import java.util.*;

class Solution {
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    } 

    public long gcdSum(int[] nums) {
        int n = nums.length;
        long maximum = (long) Integer.MIN_VALUE;
        long prefixGcd[] = new long[n];

        for(int i = 0; i < n; i++){
            maximum = Math.max(maximum, nums[i]);
            prefixGcd[i] = gcd(nums[i], maximum);
        }

        Arrays.sort(prefixGcd);

        long answer = 0;
        int left = 0;
        int right = n-1;

        while(left < right){
            answer += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right --;
        }

        return answer;

    }
}