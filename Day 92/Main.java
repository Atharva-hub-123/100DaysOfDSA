// Codeforces 271D. Good Substrings
// https://codeforces.com/problemset/problem/271/D

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String good = sc.nextLine();
        int k = sc.nextInt();

        int n = s.length();

        int maxNodes = n * (n + 1) / 2 + 1;

        int[] next = new int[(maxNodes + 1) * 26];

        int nodes = 0; 
        int answer = 0;

        for (int i = 0; i < n; i++) {

            int currentNode = 0;
            int badCount = 0;

            for (int j = i; j < n; j++) {

                int c = s.charAt(j) - 'a';

                if (good.charAt(c) == '0') {
                    badCount++;
                }

                if (badCount > k) {
                    break;
                }

                int index = currentNode * 26 + c;

                if (next[index] == 0) {

                    nodes++;

                    next[index] = nodes;

                    answer++;
                }

                currentNode = next[index];
            }
        }

        System.out.println(answer);
    }
}