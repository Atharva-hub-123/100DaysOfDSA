// Codeforces 126B. Password
// https://codeforces.com/problemset/problem/126/B

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        int[] pi = new int[n];

        for (int i = 1; i < n; i++) {

            int j = pi[i - 1];

            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = pi[j - 1];
            }

            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }

            pi[i] = j;
        }

        int maxMiddle = 0;

        for (int i = 0; i < n - 1; i++) {
            maxMiddle = Math.max(maxMiddle, pi[i]);
        }

        int k = pi[n - 1];

        while (k > maxMiddle) {
            k = pi[k - 1];
        }

        if (k == 0) {
            System.out.println("Just a legend");
        } else {
            System.out.println(s.substring(0, k));
        }

        sc.close();
    }
}