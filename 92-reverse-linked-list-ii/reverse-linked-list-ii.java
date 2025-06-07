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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if (head == null || left == right) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode leftPre=dummy;
       
        for(int i=0;i<left-1;i++){
             leftPre=leftPre.next;
            
        }
        ListNode subHead=leftPre.next;
        ListNode current=subHead;
        ListNode prev=null;
        for(int i=0;i<(right-left+1);i++){
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        subHead.next=current;
        leftPre.next=prev;
        return dummy.next;
    }
}