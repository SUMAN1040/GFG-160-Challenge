/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package LinkedList;

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) return head;

        Node dummy = new Node(0);
        dummy.next = head;

        Node prevGroupEnd = dummy;
        Node current = head;

        while (current != null) {
            Node temp = current;
            int count = 0;
            while (count < k && temp != null) {
                temp = temp.next;
                count++;
            }

            if (count == 0) break;

            Node prev = null;
            Node curr = current;
            Node groupStart = current;
            int i = 0;

            while (i < count && curr != null) {
                Node nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
                i++;
            }

            prevGroupEnd.next = prev;
            groupStart.next = curr;

            prevGroupEnd = groupStart;
            current = curr;
        }

        return dummy.next;
    }
}