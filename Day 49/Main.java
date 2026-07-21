// Codeforces 1237A. Balanced Rating Changes
// https://codeforces.com/problemset/problem/1237/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        int ans[] = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            ans[i] = a[i] / 2;
            sum += ans[i];
        }

        if (sum > 0) {
            for (int i = 0; i < n && sum > 0; i++) {
                if (a[i] < 0 && Math.abs(a[i]) % 2 == 1) {
                    ans[i]--;
                    sum--;
                }
            }
        } else if (sum < 0) {
            for (int i = 0; i < n && sum < 0; i++) {
                if (a[i] > 0 && a[i] % 2 == 1) {
                    ans[i]++;
                    sum++;
                }
            }
        }

        for (int x : ans) {
            System.out.println(x);
        }
    }
}