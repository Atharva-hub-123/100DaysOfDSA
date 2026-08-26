// Codeforces 1097B. Petr and a Combination Lock
// https://codeforces.com/problemset/problem/1097/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int mask = 0; mask < (1 << n); mask++) {

            int sum = 0;

            for (int i = 0; i < n; i++) {

                if ((mask & (1 << i)) != 0) {
                    sum += a[i];
                } else {
                    sum -= a[i];
                }
            }

            if (sum % 360 == 0) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}