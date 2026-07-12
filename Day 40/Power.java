// LeetCode 50 - Pow(x, n)
// https://leetcode.com/problems/powx-n/description/

class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long num = n;

        if(num < 0){
            num = -1 * num;
        }

        while(num > 0){
            if(num % 2 == 1){
                ans = ans * x;
                num = num - 1;
            }
            else{
                x = x * x;
                num = num / 2;
            }
        }

        if(n < 0) return (double) (1.0) / (double) (ans);
        return ans;
    }
}