// LeetCode 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
// https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/description/

/** Definition for singly-linked list. **/

class ListNode {
int val;
ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        int ans[] = new int[] {-1, -1};

        if(head == null || head.next == null || head.next.next == null){
            return ans;
        }

        ListNode temp = head.next;
        ListNode prev = head;

        int index = 2;

        int firstCritical = -1;
        int previousCritical = -1;
        int minDistance = Integer.MAX_VALUE;

        while(temp.next != null){

            if((temp.val > prev.val && temp.val > temp.next.val)|| (temp.val < prev.val && temp.val < temp.next.val)){

                if(firstCritical == -1){
                    firstCritical = index;
                }

                if(previousCritical != -1){
                    minDistance = Math.min(minDistance, index - previousCritical);
                }

                previousCritical = index;
            }

            prev = temp;
            temp = temp.next;
            index++;
        }

        if(firstCritical == -1 || firstCritical == previousCritical){
            return ans;
        }

        ans[0] = minDistance;
        ans[1] = previousCritical - firstCritical;

        return ans;
    }
}