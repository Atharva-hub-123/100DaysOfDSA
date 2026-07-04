// LeetCode 1482 - Minimum Number of Days to Make m Bouquets
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/

class Solution {
    public static boolean isPossible(int arr[], int day, int m, int k){
        int cnt = 0;
        int noOfBouquets = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= day){
                cnt++;
            }
            else{
                noOfBouquets += (cnt / k);
                cnt = 0;
            }
        }
        noOfBouquets += (cnt / k);

        if(noOfBouquets >= m) return true;
        return false;
        
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int n = bloomDay.length;

        if(n < m * k) return -1;

        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi, bloomDay[i]);
            mini = Math.min(mini, bloomDay[i]);
        }

        int low = mini;
        int high = maxi;
        int ans = -1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(isPossible(bloomDay, mid, m, k) == true){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }

        return ans;

    }
}