package LinkedListBasics;

//Time complexity : O(n)

//Space Complexity : O(n)

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

public class ReverseSinglyLL {
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static Node reverseLL(Node head) {
        Node previous = null;
        Node current = head;
        Node nextNode = null;
        while (current != null) {
            nextNode = current.next; // first preserve next node before collasping current node pointer
            current.next = previous; // then assign previous node to current node pointer
            previous = current; // then move previous pointer to present node
            current = nextNode; // then move current node to nextnode
        }
        return previous;
    }

    public static void main(String args[]) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node head = first;  // always head is the pointer that points to first node in the list
        first.next = second;
        second.next = third;

        System.out.println("Original order of linked list:");
        printList(head);

        head = reverseLL(head);

        System.out.println("Reversed order of linked list");
        printList(head);

    }
}
