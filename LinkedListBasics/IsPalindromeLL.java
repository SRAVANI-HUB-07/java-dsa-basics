package LinkedListBasics;

// "The algorithm runs in O(n) time because it traverses the list a constant number of times, and it uses O(1) extra space since the second half of the list is reversed in place using pointers.”

public class IsPalindromeLL {

    public static boolean isPalindrome(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) { // Found the middle with slow/fast safely:
            fast = fast.next.next;
            slow = slow.next;
        }
        Node current, previous = null, nextNode;
        if (fast == null) { // Correctly decided where the second half starts:
            current = slow; // even length (fast == null) → start reversing at slow
        } else {
            current = slow.next; // odd length (fast != null) → skip the middle and start at slow.next
        }
        while (current != null) { // Reversed the second half in-place (O(1) extra space)
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        slow = previous;
        Node firstHalfHead = head, secondHalfHead = slow;
        while (secondHalfHead != null) // Compared only until the end of the reversed half (while(end != null))
        {
            if (secondHalfHead.data != firstHalfHead.data)
                return false;
            secondHalfHead = secondHalfHead.next;
            firstHalfHead = firstHalfHead.next;
        }
        return true;
    }

    public static void main(String args[]) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(1);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node head = first;

        System.out.print(isPalindrome(head));
    }
}
