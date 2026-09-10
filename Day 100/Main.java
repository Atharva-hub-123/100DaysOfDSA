// Codeforces 1016B. Segment Occurrences
// https://codeforces.com/contest/1016/problem/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        String s = sc.next();
        String t = sc.next();

        int[] pref = new int[n + 1];

        for (int i = 1; i <= n - m + 1; i++) {

            if (s.startsWith(t, i - 1)) {
                pref[i] = 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            pref[i] += pref[i - 1];
        }

        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int maxStart = r - m + 1;

            if (maxStart < l) {
                System.out.println(0);
            } else {
                int answer = pref[maxStart] - pref[l - 1];
                System.out.println(answer);
            }
        }

        sc.close();
    }
}