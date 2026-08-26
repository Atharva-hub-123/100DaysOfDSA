// LeetCode 2904 - Shortest and Lexicographically Smallest Beautiful String
// https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string/description/

import java.util.*;

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<Integer> ones = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                ones.add(i);
            }
        }

        if(ones.size() < k){
            return "";
        }

        String ans = "";
        int minLen = Integer.MAX_VALUE;

        for(int i = 0; i + k - 1 < ones.size(); i++){
            int start = ones.get(i);
            int end = ones.get(i + k - 1);

            int len = end - start + 1;

            String candidate = s.substring(start, end + 1);

            if(len < minLen){
                minLen = len;
                ans = candidate;
            }

            else if(len == minLen && candidate.compareTo(ans) < 0){
                ans = candidate;
            }
        }

        return ans;
    }
}