// LeetCode 3536 - Maximum Product of Two Digits
// https://leetcode.com/problems/maximum-product-of-two-digits/description/

class Solution {
    public int maxProduct(int n) {
        int first = 0;
        int second = 0;
        while(n > 0){
            int digit = n % 10;
            if(digit > first){
                second = first;
                first = digit;
            }
            else if(digit > second){
                second = digit;
            }
            n /= 10;
        }

        return first * second; 
    }
}