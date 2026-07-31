/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next==null) return null;
        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        curr = head;
        int res = count - n;
        ListNode temp = null;
        if(res == 0)
            return head.next;
        for (int i = 1; i < res; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;

    }
}
