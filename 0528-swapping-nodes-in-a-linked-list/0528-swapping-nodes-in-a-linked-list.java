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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null) return head;
        ListNode p=head;
        ListNode q=head;
        ListNode r=null;
        for(int i = 1;i<k;i++){
            q=q.next;
        }
        r=q;
        while(q.next!=null){
            p=p.next;
            q=q.next;
        }
        int temp=p.val;
        p.val=r.val;
        r.val = temp;
        
        return head;

    }
}