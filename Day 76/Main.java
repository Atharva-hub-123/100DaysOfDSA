// Codeforces 689C. Mike and Chocolate Thieves
// https://codeforces.com/contest/689/problem/C

import java.util.*;

public class Main {

    static long count(long n) {
        long ways = 0;

        for (long k = 2; k * k * k <= n; k++) {
            long cube = k * k * k;
            ways += n / cube;
        }

        return ways;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long m = sc.nextLong();

        long low = 1;
        long high = 1;

        while (count(high) < m) {
            high *= 2;
        }

        while (low < high) {

            long mid = low + (high - low) / 2;

            if (count(mid) >= m) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        if (count(low) == m) {
            System.out.println(low);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}