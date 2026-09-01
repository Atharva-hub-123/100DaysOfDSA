// Codeforces 343B. Alternating Current
// https://codeforces.com/contest/343/problem/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        System.out.println(stack.isEmpty() ? "Yes" : "No");
    }
}