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
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode curr = head;
        HashSet<ListNode> set = new HashSet<>();

        while(curr!=null){
            if(!set.add(curr)) return true;
            curr = curr.next;
        }
        return false;
    }
}
