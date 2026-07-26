// Codeforces 1296A. Array with Odd Sum
// https://codeforces.com/problemset/problem/1296/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int odd = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if ((x & 1) == 1)
                    odd++;
            }

            int even = n - odd;

            if ((odd & 1) == 1)
                System.out.println("YES");
            else if (odd > 0 && even > 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}