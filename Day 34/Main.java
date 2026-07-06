// Codeforces 1433A. Boring Apartments 
// https://codeforces.com/problemset/problem/1433/A

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int digit = s.charAt(0) - '0';
            int len = s.length();

            int ans = (digit - 1) * 10 + (len * (len + 1)) / 2;

            System.out.println(ans);
        }
    }
}