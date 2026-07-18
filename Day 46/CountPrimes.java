// LeetCode 204 - Count Primes
// https://leetcode.com/problems/count-primes/description/

class Solution {
    public int countPrimes(int n) {
        if( n <= 2) return 0;

        boolean isPrime[] = new boolean[n + 1];

        for(int i = 0; i < n + 1; i++){
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for(int j = i*i; j <= n; j = j + i){
                    isPrime[j] = false;
                }
            }
        }

        int answer = 0;
        for(int i = 2; i < n; i++){
            if(isPrime[i]){
                answer++;
            }
        }

        return answer;
    }
}