/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
   }
} */

class Solution {
    public Node rotate(Node head, int k) {
        // code here
       if (head == null || head.next == null || k == 0) {
           return head;
       }

       Node temp = head;
       int length = 1;

       // Find length and tail
       while (temp.next != null) {
           temp = temp.next;
           length++;
       }

       // Normalize k
       k = k % length;

       if (k == 0) {
           return head;
       }

       // Make the list circular
       temp.next = head;

       // Find the new tail
       Node newTail = head;

       for (int i = 1; i < k; i++) {
           newTail = newTail.next;
       }

       // New head is after the new tail
       Node newHead = newTail.next;

       // Break the circle
       newTail.next = null;

       return newHead;

    }
}