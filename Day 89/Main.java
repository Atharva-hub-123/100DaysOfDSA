// Codeforces 1151B.Dima and a Bad XOR
// https://codeforces.com/problemset/problem/1151/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= a[i][0];
        }

        if (xor != 0) {
            System.out.println("TAK");

            for (int i = 0; i < n; i++) {
                System.out.print("1 ");
            }

            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (a[i][j] != a[i][0]) {

                    System.out.println("TAK");

                    for (int k = 0; k < n; k++) {
                        if (k == i) {
                            System.out.print((j + 1) + " ");
                        } else {
                            System.out.print("1 ");
                        }
                    }

                    System.out.println();
                    return;
                }
            }
        }

        System.out.println("NIE");
    }
}