// Codeforces 139A. Petr and Book
// https://codeforces.com/contest/139/problem/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] pages = new int[7];

        for (int i = 0; i < 7; i++) {
            pages[i] = sc.nextInt();
        }

        while (true) {
            for (int i = 0; i < 7; i++) {
                n -= pages[i];
                if (n <= 0) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
    }
}