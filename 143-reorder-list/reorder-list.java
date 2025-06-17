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
    public void reorderList(ListNode head) {
        List<ListNode>node=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            node.add(current);
            current=current.next;
        }
        int i=0;
        int j=node.size()-1;
        while(i<j){
            node.get(i).next=node.get(j);
            i++;
            if(i<j){
                node.get(j).next=node.get(i);
                j--;
            }
        }
        node.get(i).next=null;

    }
}