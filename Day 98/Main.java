// Codeforces 487B. Strip
// https://codeforces.com/contest/487/problem/B

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long s = Long.parseLong(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        long[] a = new long[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        Deque<Integer> minDeque = new ArrayDeque<>();

        Deque<Integer> maxDeque = new ArrayDeque<>();

        int[] dp = new int[n + 1];

        Arrays.fill(dp, Integer.MAX_VALUE / 2);
        dp[0] = 0;


        Deque<Integer> dpDeque = new ArrayDeque<>();

        int left = 0;

        for (int right = 0; right < n; right++) {

            while (!maxDeque.isEmpty()
                    && a[maxDeque.peekLast()] <= a[right]) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(right);

            while (!minDeque.isEmpty()
                    && a[minDeque.peekLast()] >= a[right]) {
                minDeque.pollLast();
            }
            minDeque.addLast(right);

            while (!maxDeque.isEmpty()
                    && !minDeque.isEmpty()
                    && a[maxDeque.peekFirst()]
                    - a[minDeque.peekFirst()] > s) {

                if (maxDeque.peekFirst() == left)
                    maxDeque.pollFirst();

                if (minDeque.peekFirst() == left)
                    minDeque.pollFirst();

                left++;
            }


            int j = right - l + 1;

            if (j >= 0 && dp[j] < Integer.MAX_VALUE / 2) {

                while (!dpDeque.isEmpty()
                        && dp[dpDeque.peekLast()] >= dp[j]) {
                    dpDeque.pollLast();
                }

                dpDeque.addLast(j);
            }

            while (!dpDeque.isEmpty()
                    && dpDeque.peekFirst() < left) {
                dpDeque.pollFirst();
            }

            if (!dpDeque.isEmpty()) {
                dp[right + 1] = dp[dpDeque.peekFirst()] + 1;
            }
        }

        if (dp[n] >= Integer.MAX_VALUE / 2) {
            System.out.println(-1);
        } else {
            System.out.println(dp[n]);
        }
    }
}