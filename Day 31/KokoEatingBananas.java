// LeetCode 875 - Koko Eating Bananas
// https://leetcode.com/problems/koko-eating-bananas/description/

class Solution {
    public static int maxElement(int arr[]){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            maximum = Math.max(maximum, arr[i]);
        }
        return maximum;
    }

    public static int calculateTotalHours(int arr[], int k){
        int totalHrs = 0;
        for(int i = 0; i < arr.length; i++){
            totalHrs += Math.ceil((double) arr[i] / (double) k);
        }
        return totalHrs;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxElement(piles);

        while(low <= high){
            int mid = (low + high) / 2;
            int totalHrs = calculateTotalHours(piles, mid);

            if(totalHrs <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}