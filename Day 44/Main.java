// Codeforces 1199A. City Day
// https://codeforces.com/problemset/problem/1199/A

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            boolean ok = true;

            for (int j = Math.max(0, i - x); j < i; j++) {
                if (a[j] < a[i]) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                for (int j = i + 1; j <= Math.min(n - 1, i + y); j++) {
                    if (a[j] < a[i]) {
                        ok = false;
                        break;
                    }
                }
            }

            if (ok) {
                System.out.println(i + 1); 
                return;
            }
        }
    }
}