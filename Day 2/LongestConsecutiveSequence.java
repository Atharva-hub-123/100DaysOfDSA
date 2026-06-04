// LeetCode 128 - Longest Consecutive Sequence
// https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int longest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currNum = num;
                int currLength = 1;

                while(set.contains(currNum + 1)){
                currLength++;
                currNum++;
                }

                longest = Math.max(longest, currLength);
            }
        }
        return longest;                
    }

}

