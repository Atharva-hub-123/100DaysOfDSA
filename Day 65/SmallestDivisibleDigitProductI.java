// LeetCode 3345 - Smallest Divisible Digit Product I
// https://leetcode.com/problems/smallest-divisible-digit-product-i/description/

class Solution {
    int productOfDigits(int num){
        int product = 1;
        while(num > 0){
            int digit = num % 10;
            if(digit == 0) return 0;

            product *= digit;
            num = num / 10;
        }
        return product;
    }

    public int smallestNumber(int n, int t) {
        int i = n;
        while(true) {
            if(productOfDigits(i) % t == 0) return i;
            i++;
        }
    }
}