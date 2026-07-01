// Codeforces 977A - Wrong Subtraction
// https://codeforces.com/problemset/problem/977/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n =  sc.nextInt();
        int sub = sc.nextInt();

        while(sub-- > 0){
            long digit = n % 10;
            if(digit == 0){
                n /= 10;
            }
            else{
                n = n - 1;
            }
        }

        System.out.println(n);
    }
}