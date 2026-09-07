// LeetCode 940 - Distinct Subsequences II
// https://leetcode.com/problems/distinct-subsequences-ii/description/

class Solution {
    public int distinctSubseqII(String s) {
        final long MOD = 1_000_000_007;
        long end[] = new long[26];

        for(char ch: s.toCharArray()){
            int idx = ch - 'a';
            long total = 0;

            for(long count: end){
                total = (total + count) % MOD;
            }

            end[idx] = (total + 1) % MOD;
        }

        long answer = 0;

        for(long count: end){
            answer = (answer + count) % MOD;
        }

        return (int) answer;
    }
}