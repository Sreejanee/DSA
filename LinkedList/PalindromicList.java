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
 
    public ListNode reverse(ListNode head){
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head.next =null;
        head=prev;
        return head;
    }
    public ListNode middleFind(ListNode head){
        ListNode turtle=head;
        ListNode hare=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle=middleFind(head);
        ListNode secondStart=reverse(middle.next);
        while(secondStart!=null){
            if(head.val!=secondStart.val){
                return false;
            }
            secondStart=secondStart.next;
            head=head.next;
        }
        return true;
    }
}
