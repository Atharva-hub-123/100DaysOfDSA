// Codeforces 1278A. Shuffle Hashing
// https://codeforces.com/problemset/problem/1278/A

import java.util.*;

public class Main {
    static boolean isSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String p = sc.next();
            String h = sc.next();

            int m = p.length();
            int n = h.length();

            if (n < m) {
                System.out.println("NO");
                continue;
            }

            int freqP[] = new int[26];
            int window[] = new int[26];

            for (char c : p.toCharArray())
                freqP[c - 'a']++;

            for (int i = 0; i < m; i++)
                window[h.charAt(i) - 'a']++;

            boolean found = isSame(freqP, window);

            for (int i = m; i < n && !found; i++) {
                window[h.charAt(i - m) - 'a']--;
                window[h.charAt(i) - 'a']++;

                if (isSame(freqP, window))
                    found = true;
            }

            if(found){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}