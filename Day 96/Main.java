// Codeforces 319B. Psychos in a Line
// https://codeforces.com/contest/319/problem/B

import java.util.*;

public class Main {

    static class Pair {
        int value;
        int time;

        Pair(int value, int time) {
            this.value = value;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Deque<Pair> stack = new ArrayDeque<>();

        int answer = 0;

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            int maxDeath = 0;

            while (!stack.isEmpty() && x > stack.peek().value) {

                maxDeath = Math.max(
                    maxDeath,
                    stack.pop().time
                );
            }

            int deathTime;

            if (stack.isEmpty()) {
                deathTime = 0;
            } else {
                deathTime = maxDeath + 1;
            }

            answer = Math.max(answer, deathTime);

            stack.push(new Pair(x, deathTime));
        }

        System.out.println(answer);
    }
}