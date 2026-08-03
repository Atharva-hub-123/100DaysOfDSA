// Codeforces 1367B. Even Array
// https://codeforces.com/problemset/problem/1367/B

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int wrongEven = 0;
            int wrongOdd = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (i % 2 == 0) {
                    if (x % 2 != 0)
                        wrongEven++;
                } else {
                    if (x % 2 == 0)
                        wrongOdd++;
                }
            }

            if (wrongEven != wrongOdd)
                System.out.println(-1);
            else
                System.out.println(wrongEven);
        }

        sc.close();
    }
}