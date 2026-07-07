// Codeforces 1095A. Repeating Cipher
// https://codeforces.com/problemset/problem/1095/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String t = sc.next();

        StringBuilder ans = new StringBuilder();

        int index = 0;
        int jump = 1;

        while (index < n) {
            ans.append(t.charAt(index));
            index += jump;
            jump++;
        }

        System.out.println(ans);
    }
}