// LeetCode 1140 - Stone Game II
// https://leetcode.com/problems/stone-game-ii/description/

class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;

        int suffix[] = new int[n+1];
        for(int i = n - 1; i >= 0; i--){
            suffix[i] = suffix[i+1] + piles[i];
        }

        int dp[][] = new int[n+1][n+1];

        for(int i = n - 1; i >= 0; i--){
            for(int m = 1; m <= n; m++){
                if(i + 2 * m >= n){
                    dp[i][m] = suffix[i];
                    continue;
                }

                int maxStones = 0;

                for(int x = 1; x <= 2 * m && i+ x <= n; x++){
                    int aliceTake = suffix[i] - suffix[i + x];

                    int newM = Math.max(m, x);
                    int aliceFuture = dp[i + x][newM];

                    int remaining = suffix[i + x];

                    int aliceTotal = aliceTake + (remaining - aliceFuture);

                    maxStones = Math.max(maxStones, aliceTotal);
                }

                dp[i][m] = maxStones;
            }
        }

        return dp[0][1];
    }
}