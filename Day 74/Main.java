// Codeforces 1395A. Boboniu Likes to Color Balls
// https://codeforces.com/problemset/problem/1395/A

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            long r = sc.nextLong();
            long g = sc.nextLong();
            long b = sc.nextLong();
            long w = sc.nextLong();

            int odd = 0;

            if (r % 2 == 1) odd++;
            if (g % 2 == 1) odd++;
            if (b % 2 == 1) odd++;
            if (w % 2 == 1) odd++;

            if (odd <= 1) {
                System.out.println("Yes");
            }
            else if (odd >= 3 && r > 0 && g > 0 && b > 0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}