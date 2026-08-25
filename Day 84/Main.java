// Codeforces 1594B. Special Numbers
// https://codeforces.com/problemset/problem/1594/B

import java.util.*;

public class Main {

    static final long MOD = 1_000_000_007L;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long k = sc.nextLong();

            long ans = 0;
            long power = 1;

            while (k > 0) {

                if ((k & 1) == 1) {
                    ans = (ans + power) % MOD;
                }

                k >>= 1;

                power = (power * n) % MOD;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}