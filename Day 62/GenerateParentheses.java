// LeetCode 22 - Generate Parentheses
// https://leetcode.com/problems/generate-parentheses/description/

import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        backtrack(answer,"", 0, 0, n);
        return answer;
    }

    public static void backtrack(List<String> ans, String current, int open, int close, int n){
        if(current.length() == 2*n){
            ans.add(current);
            return;
        }

        if(open < n){
            backtrack(ans, current + "(", open + 1, close, n);
        }

        if(close < open){
            backtrack(ans, current + ")", open, close + 1, n);
        }
    }
}