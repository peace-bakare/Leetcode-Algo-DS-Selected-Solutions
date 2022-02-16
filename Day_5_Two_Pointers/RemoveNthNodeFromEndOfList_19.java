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
public class RemoveNthNodeFromEndOfList_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Find the length of the LinkedList
        int length = 0;
        ListNode currentNode = head;
        
        while (currentNode != null){
            currentNode = currentNode.next;
            length++;
        }
        
        //Edge case of no head before the element to remove
        if(length == n){
            return head.next;
        }
        
        //Remove the element from the LinkedList
        int indexOfElementBefore = length - n - 1;
        currentNode = head;
        
        for (int i = 0; i < indexOfElementBefore; i++){
            currentNode = currentNode.next;
        }
        
        currentNode.next = currentNode.next.next;
        
        return head;
    }
}
