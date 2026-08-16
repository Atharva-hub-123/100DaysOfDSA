// Codeforces 546D. Soldier and Number Game
// https://codeforces.com/contest/546/problem/D

import java.io.*;

public class Main {

    static final int MAX = 5_000_000;
    static int[] omega = new int[MAX + 1];

    static void precompute() {

        for (int p = 2; p <= MAX; p++) {

            if (omega[p] == 0) {

                long power = p;

                while (power <= MAX) {

                    int step = (int) power;

                    for (int j = step; j <= MAX; j += step) {
                        omega[j]++;
                    }

                    if (power > MAX / p) {
                        break;
                    }

                    power *= p;
                }
            }
        }

        for (int i = 2; i <= MAX; i++) {
            omega[i] += omega[i - 1];
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        precompute();

        while (t-- > 0) {

            int a = fs.nextInt();
            int b = fs.nextInt();

            int answer = omega[a] - omega[b];

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

            int num = 0;

            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num * sign;
        }
    }
}