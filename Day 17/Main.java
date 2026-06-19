// Codeforces 514 - A. Chewbaсca and Number
// https://codeforces.com/contest/514/problem/A

import java.util.*;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        char arr[] = num.toCharArray();

        for(int i = 0; i < arr.length; i++){
            int digit = arr[i] - '0';
            int inverted = 9 - digit;

            if(i == 0 && digit == 9){
                continue;
            }

            if(inverted < digit){
                arr[i] = (char)(inverted + '0');
            }
        }
        System.out.println(new String(arr));
    }
}