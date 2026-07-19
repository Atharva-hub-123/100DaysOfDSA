// LeetCode 316 - Remove Duplicate Letters
// https://leetcode.com/problems/remove-duplicate-letters/description/

import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        int frequency[] = new int[26];
        boolean visited[] = new boolean[26];

        for(char ch: s.toCharArray()){
            frequency[ch- 'a']++;
        }
        
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            frequency[ch - 'a']--;

            if(visited[ch - 'a']) continue;

            while(!stack.isEmpty() && stack.peek() > ch && frequency[stack.peek() - 'a'] > 0){
                visited[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for(char ch: stack){
            ans.append(ch);
        }

        return ans.toString();
    }
}