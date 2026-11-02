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
        ListNode headNode;
        if(list1 == null){
            return list2;
        } else if (list2 == null){
            return list1;
        } else if(list1 == null && list2 == null){
            return null;
        }
        if(list1.val < list2.val){
            headNode = list1;
            list1 = list1.next;
        }        
        else{
            headNode = list2;
            list2 = list2.next;
        }
        ListNode curNode = headNode;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                curNode.next = list1;
                list1 = list1.next;
            }        
            else{
                curNode.next = list2;
                list2 = list2.next;
            }
            curNode = curNode.next;    
        }
        while(list1 != null){
            curNode.next = list1;
            list1 = list1.next;
            curNode = curNode.next;
        }
        while(list2 != null){
            curNode.next = list2;
            list2 = list2.next;
            curNode = curNode.next;
        }
        return headNode;

    }
}