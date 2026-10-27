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
        Stack<ListNode> reverse = new Stack<>();
        ListNode cur = head;
        while(cur != null){
            reverse.push(cur);
            cur = cur.next;
        }
        if(!reverse.isEmpty()){
            ListNode tail = reverse.pop();
            cur = tail;
        }
        else {
            return cur;
        }
        ListNode tail = cur;
        while(!reverse.isEmpty()){
            cur.next = reverse.pop();
            cur = cur.next;
        }
        cur.next = null;        
        return tail;
    }
}
