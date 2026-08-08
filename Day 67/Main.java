// Codeforces 111B. Petya and Divisors
// https://codeforces.com/problemset/problem/111/B

import java.io.*;


public class Main {

    static int[] last = new int[100001];

    static int solve(int x, int y, int index) {

        int answer = 0;
        int limit = index - y;

        for (int d = 1; d * d <= x; d++) {

            if (x % d != 0) {
                continue;
            }

            if (last[d] < limit) {
                answer++;
            }

            int other = x / d;

            if (other != d) {
                if (last[other] < limit) {
                    answer++;
                }
            }
        }

        for (int d = 1; d * d <= x; d++) {

            if (x % d != 0) {
                continue;
            }

            last[d] = index;

            int other = x / d;

            if (other != d) {
                last[other] = index;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        int n = fs.nextInt();

        for (int i = 1; i <= n; i++) {

            int x = fs.nextInt();
            int y = fs.nextInt();

            int answer = solve(x, y, i);

            out.append(answer).append('\n');
        }

        System.out.print(out);
    }

    static class FastScanner {

        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {

            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0) {
                    return -1;
                }
            }

            return buffer[ptr++];
        }

        int nextInt() throws IOException {

            int c;
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            int number = 0;

            while (c > ' ') {
                number = number * 10 + (c - '0');
                c = read();
            }

            return number * sign;
        }
    }
}