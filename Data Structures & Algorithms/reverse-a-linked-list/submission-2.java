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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int[] arr = new int[len];
        ListNode temp1 = head;
        for(int i = 0; i < len; i++){
            arr[i] = temp1.val;
            temp1 = temp1.next;
        }
        if(len > 0){
            ListNode newHead = new ListNode(arr[len - 1]);
            ListNode mover = newHead;
            for(int i = len - 2; i >= 0; i--){
                ListNode t = new ListNode(arr[i]);
                mover.next =t;
                mover = t;
            }
            return newHead;
        }
        else{
            return null;
        }    
    }
}
