// LeetCode 3622 - Check Divisibility by Digit Sum and Product
// https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/description/

class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int num = n;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        return n % (sum + product) == 0;
    }
}