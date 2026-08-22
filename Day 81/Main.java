// Codeforces 1613C. Poisoned Dagger
// https://codeforces.com/problemset/problem/1613/C

import java.util.*;

public class Main {

    static long calculateDamage(long[] a, long k, long h) {
        long damage = 0;

        for (int i = 0; i < a.length - 1; i++) {
            damage += Math.min(k, a[i + 1] - a[i]);

            if (damage >= h) {
                return damage;
            }
        }

        damage += k;

        return damage;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long h = sc.nextLong();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long low = 1;
            long high = h;

            while (low < high) {

                long mid = low + (high - low) / 2;

                long damage = calculateDamage(a, mid, h);

                if (damage >= h) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(low);
        }

        sc.close();
    }
}