// Codeforces 463B. Caisa and Pylons
// https://codeforces.com/problemset/problem/463/B

 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            maxHeight = Math.max(maxHeight, h);
        }

        System.out.println(maxHeight);

        sc.close();
    }
}