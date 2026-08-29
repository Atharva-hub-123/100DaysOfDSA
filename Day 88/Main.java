// Codeforces 1494B. Berland Crossword
// https://codeforces.com/problemset/problem/1494/B

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int U = sc.nextInt();
            int R = sc.nextInt();
            int D = sc.nextInt();
            int L = sc.nextInt();

            boolean possible = false;


            for (int a = 0; a <= 1; a++) {
                for (int b = 0; b <= 1; b++) {
                    for (int c = 0; c <= 1; c++) {
                        for (int d = 0; d <= 1; d++) {

                            int top = U - a - b;
                            int right = R - b - c;
                            int bottom = D - c - d;
                            int left = L - d - a;

                            if (top >= 0 && top <= n - 2 &&
                                right >= 0 && right <= n - 2 &&
                                bottom >= 0 && bottom <= n - 2 &&
                                left >= 0 && left <= n - 2) {

                                possible = true;
                            }
                        }
                    }
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}