// Codeforces 1107B. Digital root
// https://codeforces.com/problemset/problem/1107/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            long k = sc.nextLong();
            long x = sc.nextLong();

            long ans = x + 9 * (k - 1);

            System.out.println(ans);
        }

        sc.close();
    }
}







