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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if ( null == head ) {
            return head;
        }

        ListNode curr = head;
        Integer size = 0;

        while(null != curr ){
            size++;
            curr = curr.next;
        } 

        if(n == size){
            return head.next;
        }  

        size -= n;
        curr = head;
        while(size > 1){
            curr = curr.next;
            size--;
        }

        curr.next = curr.next.next;
        
        return head;
    }
}
