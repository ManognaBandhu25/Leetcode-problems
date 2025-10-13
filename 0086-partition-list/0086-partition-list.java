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
    public ListNode partition(ListNode head, int x) {
        ListNode dummyp = new ListNode();
        ListNode dummyq = new ListNode();
        ListNode temppp = dummyp;
        ListNode tempqp = dummyq;
        while(head!=null){
            if(head.val<x){
                temppp.next = head;
                temppp = temppp.next;
            }
            else{
                tempqp.next=head;
                tempqp=tempqp.next;
            }
            head=head.next;
        }
        tempqp.next=null;
        temppp.next=dummyq.next;
        
        return dummyp.next;
    }
}