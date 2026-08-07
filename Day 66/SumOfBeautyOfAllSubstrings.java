// LeetCode 1781 - Sum of Beauty of All Substrings
// https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/

class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int answer = 0;

        for (int left = 0; left < n; left++) {

            int frequency[] = new int[26];

            for (int right = left; right < n; right++) {

                frequency[s.charAt(right) - 'a']++;

                int maxFrequency = 0;
                int minFrequency = Integer.MAX_VALUE;

                for (int count : frequency) {
                    if (count == 0) {
                        continue;
                    }

                    maxFrequency = Math.max(maxFrequency, count);
                    minFrequency = Math.min(minFrequency, count);
                }

                answer += maxFrequency - minFrequency;
            }
        }

        return answer;
    }
}