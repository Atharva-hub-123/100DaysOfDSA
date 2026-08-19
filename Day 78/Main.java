// Codeforces 1073C. Vasya and Robot
// https://codeforces.com/contest/1073/problem/C

import java.util.*;

public class Main {

    static int n;
    static String s;
    static long targetX, targetY;

    static long[] prefixX;
    static long[] prefixY;

    static boolean can(int k) {

        for (int l = 0; l + k <= n; l++) {

            int r = l + k;

            long windowX = prefixX[r] - prefixX[l];
            long windowY = prefixY[r] - prefixY[l];

            long totalX = prefixX[n];
            long totalY = prefixY[n];

            long outsideX = totalX - windowX;
            long outsideY = totalY - windowY;

            long dx = targetX - outsideX;
            long dy = targetY - outsideY;

            long distance = Math.abs(dx) + Math.abs(dy);

            if (distance <= k && (distance % 2 == k % 2)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        s = sc.next();

        targetX = sc.nextLong();
        targetY = sc.nextLong();

        prefixX = new long[n + 1];
        prefixY = new long[n + 1];

        for (int i = 0; i < n; i++) {

            prefixX[i + 1] = prefixX[i];
            prefixY[i + 1] = prefixY[i];

            char c = s.charAt(i);

            if (c == 'U') {
                prefixY[i + 1]++;
            } 
            else if (c == 'D') {
                prefixY[i + 1]--;
            } 
            else if (c == 'L') {
                prefixX[i + 1]--;
            } 
            else if (c == 'R') {
                prefixX[i + 1]++;
            }
        }

        if (prefixX[n] == targetX && prefixY[n] == targetY) {
            System.out.println(0);
            return;
        }

        int low = 1;
        int high = n;
        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (can(mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(answer);
    }
}