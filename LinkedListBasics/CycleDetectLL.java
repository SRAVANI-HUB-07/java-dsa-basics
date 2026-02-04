package LinkedListBasics;

//Floyd’s Cycle Detection Algorithm is a technique used to determine whether a linked list has a cycle, using two pointers moving at different speeds.

//It is also called the Tortoise and Hare algorithm.

//Time complexity: O(n) and space complexity: O(1)

public class CycleDetectLL {

    public static boolean isCycleDetected(Node head) {
       
        Node slow=head, fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        System.out.print(isCycleDetected(first));
    }
}
