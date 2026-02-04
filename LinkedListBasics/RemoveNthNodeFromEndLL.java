package LinkedListBasics;

//“The algorithm runs in O(n) time and O(1) space because it scans the list once and uses only constant extra pointers.”

public class RemoveNthNodeFromEndLL {

    public static Node removeNthNode(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head; //Create a dummy node before the head .This makes it easy even when you need to delete the head node.
        Node slow = dummy;
        Node fast = dummy;
        while (n + 1 > 0) { //Move fast forward n+1 times. This creates a gap of n nodes between fast and slow.
            fast = fast.next;
            n--;
        }
        while (fast != null) {
            fast = fast.next; // Move both fast and slow forward together until fast becomes null.
            slow = slow.next;
        }
        // Now slow is standing right before the node to delete.
        slow.next = slow.next.next; // Delete wanted node using this
        return dummy.next; // now this is new head. 
    }

    public static void main(String args[]) {
        Node first = new Node(1); // using already existing Node class from CreateLinkedList.java
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        Node head = first;
        head = removeNthNode(head, 1);
        System.out.println("List after removing Nth node:");
        CreateLinkedList.printList(head);
    }

}
