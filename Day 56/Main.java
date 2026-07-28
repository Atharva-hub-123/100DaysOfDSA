// Codeforces 371C.Hamburgers
// https://codeforces.com/contest/371/problem/C

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String recipe = sc.next();

        long needB = 0, needS = 0, needC = 0;

        for (char ch : recipe.toCharArray()) {
            if (ch == 'B') {
                needB++;
            }
            else if(ch == 'S'){ 
                needS++;
            }
            else {
                needC++;
            }
        }

        long nb = sc.nextLong();
        long ns = sc.nextLong();
        long nc = sc.nextLong();

        long pb = sc.nextLong();
        long ps = sc.nextLong();
        long pc = sc.nextLong();

        long r = sc.nextLong();

        long low = 0;
        long high = 10000000000000L;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            long buyB = Math.max(0L, needB * mid - nb);
            long buyS = Math.max(0L, needS * mid - ns);
            long buyC = Math.max(0L, needC * mid - nc);

            long cost = buyB * pb + buyS * ps + buyC * pc;

            if (cost <= r) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
