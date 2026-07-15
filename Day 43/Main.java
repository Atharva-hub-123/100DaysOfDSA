// Codeforces 1139B. Chocolates
// https://codeforces.com/problemset/problem/1139/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long a[] = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long ans = a[n - 1];
        long prev = a[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            long curr = Math.min(a[i], prev - 1);

            if (curr < 0){
                curr = 0;
            }

            ans += curr;
            prev = curr;
        }

        System.out.println(ans);
    }
}