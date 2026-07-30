// Codeforces 1294A. Collecting Coins
// https://codeforces.com/problemset/problem/1294/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long n = sc.nextLong();

            long total = a + b + c + n;

            if (total % 3 != 0) {
                System.out.println("NO");
                continue;
            }

            long target = total / 3;

            if (target >= a && target >= b && target >= c)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}

