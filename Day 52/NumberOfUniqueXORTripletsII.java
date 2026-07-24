// LeetCode 3514 - Number of Unique XOR Triplets II
// https://leetcode.com/problems/number-of-unique-xor-triplets-ii/description/

import java.util.*;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        for (int x : nums)
            unique.add(x);

        boolean dp[][] = new boolean[4][2048];
        dp[0][0] = true;

        for (int num : unique) {

            boolean[][] next = new boolean[4][2048];

            for (int c = 0; c <= 3; c++) {
                for (int x = 0; x < 2048; x++) {

                    if (!dp[c][x]) continue;

                    next[c][x] = true;

                    if (c < 3){
                        next[c + 1][x ^ num] = true;
                    }
                }
            }

            dp = next;
        }

        boolean[] ans = new boolean[2048];

        for (int x = 0; x < 2048; x++){
            if (dp[1][x]){
                ans[x] = true;
            }
        }

        for (int x = 0; x < 2048; x++){
            if (dp[3][x]){
                ans[x] = true;
            }
        }

        int res = 0;
        for (boolean b : ans){
            if(b) {
                res++;
            }
        }
        return res;
    }
}