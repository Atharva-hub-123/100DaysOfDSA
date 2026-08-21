// Codeforces 448D. Multiplication Table
// https://codeforces.com/contest/448/problem/D

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();

        if (n > m) {
            long temp = n;
            n = m;
            m = temp;
        }

        long low = 1;
        long high = n * m;

        while (low < high) {

            long mid = low + (high - low) / 2;

            long count = countLessOrEqual(mid, n, m);

            if (count >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(low);
    }

    static long countLessOrEqual(long x, long n, long m) {

        long count = 0;

        for (long i = 1; i <= n; i++) {
            count += Math.min(m, x / i);
        }

        return count;
    }
}