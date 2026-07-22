// LeetCode 881 - Boats to Save People
// https://leetcode.com/problems/boats-to-save-people/description/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int low = 0;
        int high = people.length - 1;
        int ans = 0;

        while(low <= high){
            if(people[low] + people[high] <= limit){
                low++;
            }
            high--;
            ans++;
        }

        return ans;

    }
}