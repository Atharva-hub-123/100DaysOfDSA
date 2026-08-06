// Codeforces 1463A. Dungeon
// https://codeforces.com/problemset/problem/1463/A

import java.util.Scanner;

public class Main {

    static boolean possible(long a, long b, long c, long k) {
        if (k > Math.min(a, Math.min(b, c))) {
            return false;
        }

        long required = (a - k) + (b - k) + (c - k);
        long available = 6 * k;

        return required == available;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long low = 1;
            long high = Math.min(a, Math.min(b, c));

            boolean found = false;

            while (low <= high) {

                long mid = low + (high - low) / 2;

                long value = (a + b + c) - 9 * mid;

                if (value == 0) {
                    found = possible(a, b, c, mid);
                    break;
                } else if (value > 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}