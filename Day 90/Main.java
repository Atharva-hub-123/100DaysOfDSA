// Codeforces 1225C. p-binary
// https://codeforces.com/problemset/problem/1225/C

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        for (int k = 1; k <= 31; k++) {

            int remaining = n - k * p;

            if (remaining < k) {
                continue;
            }

            int setBits = Integer.bitCount(remaining);

            if (setBits <= k) {
                System.out.println(k);
                return;
            }
        }

        System.out.println(-1);
    }
}