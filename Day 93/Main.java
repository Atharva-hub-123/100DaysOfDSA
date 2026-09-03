// Codeforces 5C. Longest Regular Bracket Sequence
// https://codeforces.com/contest/5/problem/C

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int n = s.length();

        int[] stack = new int[n + 1];

        int top = 0;

        stack[top++] = -1;

        int maxLength = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '(') {

                stack[top++] = i;

            } else {

                top--;

                if (top == 0) {

                    stack[top++] = i;

                } else {

                    int length = i - stack[top - 1];

                    if (length > maxLength) {
                        maxLength = length;
                        count = 1;
                    } 
                    else if (length == maxLength) {
                        count++;
                    }
                }
            }
        }

        if (maxLength == 0) {
            System.out.println("0 1");
        } else {
            System.out.println(maxLength + " " + count);
        }
    }
}