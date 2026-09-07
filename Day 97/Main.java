// Codeforces 514C. Watto and Mechanism
// https://codeforces.com/contest/514/problem/C

import java.io.*;

public class Main {

    static int[][] next;
    static boolean[] terminal;
    static int nodes;

    static void insert(String s) {
        int cur = 0;

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';

            if (next[cur][c] == 0) {
                next[cur][c] = nodes++;
            }

            cur = next[cur][c];
        }

        terminal[cur] = true;
    }

    static boolean exists(String s) {
        int len = s.length();

        int[] stackNode = new int[2 * len + 5];
        int[] stackPos = new int[2 * len + 5];
        byte[] stackDiff = new byte[2 * len + 5];

        int top = 0;

        stackNode[top] = 0;
        stackPos[top] = 0;
        stackDiff[top] = 0;
        top++;

        while (top > 0) {

            --top;

            int node = stackNode[top];
            int pos = stackPos[top];
            int diff = stackDiff[top];

            if (pos == len) {
                if (diff == 1 && terminal[node]) {
                    return true;
                }
                continue;
            }

            int required = s.charAt(pos) - 'a';

            int same = next[node][required];

            if (same != 0) {
                stackNode[top] = same;
                stackPos[top] = pos + 1;
                stackDiff[top] = (byte) diff;
                top++;
            }

            if (diff == 0) {

                for (int c = 0; c < 3; c++) {

                    if (c == required)
                        continue;

                    int child = next[node][c];

                    if (child != 0) {
                        stackNode[top] = child;
                        stackPos[top] = pos + 1;
                        stackDiff[top] = 1;
                        top++;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();
        int m = fs.nextInt();

    
        int MAX = 600000 + 5;

        next = new int[MAX][3];
        terminal = new boolean[MAX];

        nodes = 1; 

        for (int i = 0; i < n; i++) {
            insert(fs.next());
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < m; i++) {

            String query = fs.next();

            if (exists(query)) {
                ans.append("YES\n");
            } else {
                ans.append("NO\n");
            }
        }

        System.out.print(ans);
    }

    static class FastScanner {

        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

        FastScanner(InputStream is) {
            in = is;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0)
                    return -1;
            }

            return buffer[ptr++];
        }

        String next() throws IOException {

            StringBuilder sb = new StringBuilder();

            int c;

            do {
                c = read();
            } while (c <= ' ');

            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }

            return sb.toString();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}