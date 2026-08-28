// LeetCode 907 - Sum of Subarray Minimums
// https://leetcode.com/problems/sum-of-subarray-minimums/description/

import java.util.*;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long MOD = 1_000_000_007L;
        long ans = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i <= n; i++){
            long curr = (i == n) ? Long.MIN_VALUE : arr[i];

            while(!stack.isEmpty() && arr[stack.peek()] > curr){
                int mid = stack.pop();

                int leftBoundary = stack.isEmpty() ? -1: stack.peek();

                int left = mid - leftBoundary;
                int right = i - mid;

                long contribution = (long) arr[mid] * left * right;

                ans = (ans + contribution) % MOD;
            }

            stack.push(i);
        }

        return (int) ans;
    }
}