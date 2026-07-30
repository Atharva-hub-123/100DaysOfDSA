// LeetCode 451 - Sort Characters By Frequency
// https://leetcode.com/problems/sort-characters-by-frequency/description/

import java.util.*;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b)- map.get(a));

        pq.addAll(map.keySet());
        StringBuilder ans = new StringBuilder();

        while(!pq.isEmpty()){
            char ch = pq.poll();
            int frequency = map.get(ch);

            while(frequency > 0){
                ans.append(ch);
                frequency--;
            }
        }

        return ans.toString();
    }
}