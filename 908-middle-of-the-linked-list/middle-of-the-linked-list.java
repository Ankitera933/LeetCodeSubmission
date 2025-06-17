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
    public ListNode middleNode(ListNode head) {
       int cnt=0;
       ListNode current=head;
       while(current!=null){
        current=current.next;
        cnt++;
       } 
       
       int middle=cnt/2;
       ListNode current2=head;
       for(int i=0;i<middle;i++){
        current2=current2.next;
       }
       return current2;
    }
}