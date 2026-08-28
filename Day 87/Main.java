// Codeforces 1095C. Powers Of Two
// https://codeforces.com/problemset/problem/1095/C

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int minTerms = Integer.bitCount(n);

        if (k < minTerms || k > n) {
            System.out.println("NO");
            return;
        }

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        int x = n;

        while (x > 0) {
            int power = Integer.highestOneBit(x);
            pq.add(power);
            x -= power;
        }

        while (pq.size() < k) {
            int largest = pq.poll();

            int half = largest / 2;

            pq.add(half);
            pq.add(half);
        }

        System.out.println("YES");

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }

        sc.close();
    }
}