// Codeforces 1228C. Primes and Multiplication
// https://codeforces.com/contest/1228/problem/C

import java.io.*;
import java.util.*;

public class Main {

    static final long MOD = 1_000_000_007L;

    static long modPow(long base, long exp) {
        long result = 1;

        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }

    static long getExponent(long n, long p) {

        long exponent = 0;
        long power = p;

        while (power <= n) {

            exponent += n / power;

            if (power > n / p) {
                break;
            }

            power *= p;
        }

        return exponent;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());

        long answer = 1;

        long temp = x;

        for (long p = 2; p * p <= temp; p += (p == 2 ? 1 : 2)) {

            if (temp % p == 0) {

                long exponent = getExponent(n, p);

                answer = (answer * modPow(p, exponent)) % MOD;

                while (temp % p == 0) {
                    temp /= p;
                }
            }
        }

        if (temp > 1) {

            long exponent = getExponent(n, temp);

            answer = (answer * modPow(temp, exponent)) % MOD;
        }

        System.out.println(answer);
    }
}