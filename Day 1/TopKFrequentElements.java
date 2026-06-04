// LeetCode 347- Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> bucket[] = new ArrayList[nums.length + 1];
        for(int key : map.keySet()){
            int freq =  map.get(key);

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<> ();
            }
            bucket[freq].add(key);
        }

        int result[] = new int[k];
        int index = 0;
        int i = bucket.length - 1;
        while((i >= 0) && (index < k)){
            if(bucket[i] != null){
                for(int num: bucket[i]){
                    result[index] = num;
                    index++;

                    if(index == k){
                        break;
                    }
                }
            }
            i--;
        }
        return result;
    }
}
