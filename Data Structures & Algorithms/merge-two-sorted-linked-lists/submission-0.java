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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode first = list1;
        ListNode second = list2;

        ListNode curr = null;
        ListNode head = null;

        if(first == null){
            return second;
        }else if(second == null){
            return first;
        }

        if(first.val <= second.val){
            curr = first;
            first = first.next;
        }else{
            curr = second;
            second = second.next;
        }

        head = curr;

        while(first != null && second != null){
            if(first.val <= second.val ){
                curr.next = first;
                first = first.next;
            }else{
                curr.next = second;
                second = second.next;
            }
            curr = curr.next;
        }
        if(first == null){
            curr.next = second;
        }

        if(second == null){
            curr.next = first;
        }

        return head;
    }
}