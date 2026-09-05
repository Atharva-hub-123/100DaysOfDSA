// LeetCode 25 - Reverse Nodes in k-Group
// https://leetcode.com/problems/reverse-nodes-in-k-group/description/

/** Definition for singly-linked list.  **/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    private ListNode getKthNode(ListNode curr, int k){
        while(curr != null && k > 0){
            curr = curr.next;
            k--;
        }
        return curr;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while(true){
            ListNode kth = getKthNode(groupPrev, k);

            if(kth == null){
                break;
            }

            ListNode groupNext = kth.next;

            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;

            while(curr != groupNext){
                ListNode next = curr.next;

                curr.next = prev;
                prev = curr;
                curr = next;
                
            }

            ListNode oldGroupStart = groupPrev.next;
            groupPrev.next = kth;

            groupPrev = oldGroupStart;
        }

        return dummy.next;
    }
}