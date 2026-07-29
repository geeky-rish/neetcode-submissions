class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = null, tail = null;

        while (list1 != null && list2 != null) {

            ListNode chosen;

            if (list1.val <= list2.val) {
                chosen = list1;
                list1 = list1.next;
            } else {
                chosen = list2;
                list2 = list2.next;
            }

            if (head == null) {
                head = chosen;
                tail = chosen;
            } else {
                tail.next = chosen;
                tail = tail.next;
            }
        }

        if (list1 != null)
            tail.next = list1;
        else
            tail.next = list2;

        return head;
    }
}