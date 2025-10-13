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
    public ListNode mergeNodes(ListNode head) {
        ListNode p = new ListNode(0);
        ListNode q=p;
        head = head.next;
        int sum = 0;
    
        while(head!= null){
            if(head.val == 0){
                q.next = new ListNode(sum);
                q=q.next;
                sum = 0;
            }
            sum += head.val;
           head = head.next;
        }
        return p.next;
    }
}