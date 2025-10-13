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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        int c = 1;

        while (c < lists.length) {
            for (int i = 0; i + c < lists.length; i += c * 2) {
                lists[i] = mergeTwoLists(lists[i], lists[i + c]);
            }
            c *= 2;
        }

        return lists[0];
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p = new ListNode(0);
        ListNode q = p;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                q.next = list1;
                list1 = list1.next;
            } else {
                q.next = list2;
                list2 = list2.next;
            }
            q = q.next;
        }

        if (list1 != null) q.next = list1;
        else q.next = list2;

        return p.next;
    }
}
