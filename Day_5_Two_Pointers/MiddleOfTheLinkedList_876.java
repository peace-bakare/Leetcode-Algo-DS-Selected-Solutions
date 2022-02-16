/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day_5_Two_Pointers;

/**
 *
 * @author Peace E. BAKARE
 */


   //Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class MiddleOfTheLinkedList_876 {
    public ListNode middleNode(ListNode head) {        
//         ListNode [] list = new ListNode[100];
//         int count = 0;
        
//         while (head != null){
//             list[count++] = head;
//             head = head.next;
//         }
//         return list[count / 2];
        
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
