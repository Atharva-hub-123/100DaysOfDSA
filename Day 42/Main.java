// 131A. cAPS lOCK
// https://codeforces.com/problemset/problem/131/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean change = true;

        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                change = false;
                break;
            }
        }

        if (change) {
            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (Character.isUpperCase(ch)){
                    ans.append(Character.toLowerCase(ch));
                }
                else{
                    ans.append(Character.toUpperCase(ch));
                }
            }

            System.out.println(ans);
        } 
        else {
            System.out.println(s);
        }
    }
}