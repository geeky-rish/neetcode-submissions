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
        while(curr!=null){
            if(res-- > 0){
                temp = curr;
                curr = curr.next;
            } else{
                temp.next = curr.next;
                break;
            }
            
        }
        return head;

    }
}
