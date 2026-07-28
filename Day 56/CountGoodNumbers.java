// LeetCode 1922 - Count Good Numbers
// https://leetcode.com/problems/count-good-numbers/description/

class Solution {
    static final int MOD = 1000000007;

    public long power(long base, long exp){
        long ans = 1;

        while(exp > 0){
            if((exp & 1) == 1){
                ans = (ans * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return ans;
    }

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans = (power(5, even) * power(4, odd)) % MOD;

        return (int) ans;
    }
}