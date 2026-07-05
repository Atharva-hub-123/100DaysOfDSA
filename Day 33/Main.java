// Codeforces 492A. Vanya and Cubes
// https://codeforces.com/problemset/problem/492/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cubes = sc.nextInt();

        int cubesInRow = 0;
        int level = 0;

        for (int i = 1; ; i++) {
            cubesInRow += i;

            if (cubes < cubesInRow)
                break;

            cubes -= cubesInRow;
            level++;
        }

        System.out.println(level);
    }
}