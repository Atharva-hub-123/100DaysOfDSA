// Codeforces 510A. Fox And Snake
// https://codeforces.com/problemset/problem/510/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) { 
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            } 
            
            else {
                if ((i / 2) % 2 == 1) { 
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } 
                else { 
                    System.out.print("#");
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                }
            }

            System.out.println();
        }

        sc.close();
    }
}