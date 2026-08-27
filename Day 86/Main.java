// Codeforces 1602C. Array Elimination
// https://codeforces.com/contest/1602/problem/C

import java.util.*;

public class Main {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] count = new int[30];

            for (int i = 0; i < n; i++) {

                int x = sc.nextInt();

                for (int bit = 0; bit < 30; bit++) {

                    if ((x & (1 << bit)) != 0) {
                        count[bit]++;
                    }
                }
            }

            int g = 0;

            for (int bit = 0; bit < 30; bit++) {

                if (count[bit] > 0) {
                    g = gcd(g, count[bit]);
                }
            }

            for (int k = 1; k <= n; k++) {

                if (g % k == 0) {
                    System.out.print(k + " ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}