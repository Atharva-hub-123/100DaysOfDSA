// Codeforces 670D1. Magic Powder - 1
// https://codeforces.com/contest/670/problem/D1

import java.util.*;

public class Main {

    static int n, k;
    static long[] a, b;

    static boolean canMake(long cookies) {

        long powder = 0;

        for (int i = 0; i < n; i++) {

            long need = a[i] * cookies;

            if (need > b[i]) {
                powder += (need - b[i]);

                if (powder > k)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        a = new long[n];
        b = new long[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextLong();

        for (int i = 0; i < n; i++)
            b[i] = sc.nextLong();

        long low = 0;
        long high = 2_000_000_000L;
        long ans = 0;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (canMake(mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}