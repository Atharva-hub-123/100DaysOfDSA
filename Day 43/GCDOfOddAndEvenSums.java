// LeetCode 3658 - GCD of Odd and Even Sums
// https://leetcode.com/problems/gcd-of-odd-and-even-sums/description/

class Solution {
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        int i = 1;
        while(i <= 2*n) {
            if(i % 2 == 0){
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
            i++;
        }

        return gcd(sumEven, sumOdd);

    }
}


