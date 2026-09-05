// Codeforces 1515C. Phoenix and Towers
// https://codeforces.com/contest/1515/problem/C

import java.io.*;
import java.util.*;

public class Main {

    static class Tower {
        int height;
        int index;

        Tower(int height, int index) {
            this.height = height;
            this.index = index;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int[] h = new int[n];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(st.nextToken());
            }

            PriorityQueue<Tower> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a.height != b.height)
                        return Integer.compare(a.height, b.height);

                    return Integer.compare(a.index, b.index);
                }
            );

            for (int i = 0; i < m; i++) {
                pq.offer(new Tower(0, i));
            }

            int[] answer = new int[n];

            int[] towerHeight = new int[m];

            for (int i = 0; i < n; i++) {

                Tower tower = pq.poll();

                tower.height += h[i];

                answer[i] = tower.index + 1;

                towerHeight[tower.index] = tower.height;

                pq.offer(tower);
            }

            int minHeight = Integer.MAX_VALUE;
            int maxHeight = Integer.MIN_VALUE;

            for (int height : towerHeight) {
                minHeight = Math.min(minHeight, height);
                maxHeight = Math.max(maxHeight, height);
            }

            if (maxHeight - minHeight <= x) {

                out.append("YES\n");

                for (int i = 0; i < n; i++) {
                    out.append(answer[i]).append(" ");
                }

                out.append("\n");

            } else {
                out.append("NO\n");
            }
        }

        System.out.print(out);
    }
}
