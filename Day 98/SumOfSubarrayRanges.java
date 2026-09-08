// LeetCode 2104 - Sum of Subarray Ranges
// https://leetcode.com/problems/sum-of-subarray-ranges/description/

class Solution {

    public long subArrayRanges(int[] nums) {
        return sumMax(nums) - sumMin(nums);
    }

    private long sumMax(int[] nums) {
        int n = nums.length;
        long sum = 0;

        int[] prev = new int[n];
        int[] next = new int[n];

        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }

            prev[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }

            next[i] = stack.isEmpty() ? n : stack.peek();

            stack.push(i);
        }

        for (int i = 0; i < n; i++) {

            long left = i - prev[i];
            long right = next[i] - i;

            sum += (long) nums[i] * left * right;
        }

        return sum;
    }

    private long sumMin(int[] nums) {
        int n = nums.length;
        long sum = 0;

        int[] prev = new int[n];
        int[] next = new int[n];

        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }

            prev[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }

            next[i] = stack.isEmpty() ? n : stack.peek();

            stack.push(i);
        }

        for (int i = 0; i < n; i++) {

            long left = i - prev[i];
            long right = next[i] - i;

            sum += (long) nums[i] * left * right;
        }

        return sum;
    }
}