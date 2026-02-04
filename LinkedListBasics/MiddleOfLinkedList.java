package LinkedListBasics;

// Time complexity : O(n)

// Space complecity : O(1)

//Slow–fast pointer approach: One pointer moves one step at a time, another moves two steps at a time; if the fast pointer reaches end of list by that iteration that means slow pointer has already reached half the way of list.

public class MiddleOfLinkedList {

    public static int middleOfLinkedList(Node head)
    {
        Node slow=head, fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public static void main(String args[])
    {
       Node first=new Node(1); // using already existing Node class from CreateLinkedList.java
       Node second = new Node(2);
       Node third = new Node(3);
       Node fourth = new Node(4);
       Node fifth = new Node(5);
       Node sixth = new Node(6);

       first.next=second;
       second.next=third;
       third.next=fourth;
       fourth.next=fifth;
       fifth.next=sixth;

       //CreateLinkedList.printList(first); // since printList is a static method in class CreateLinkedList, we are accessing it directly using class name

        System.out.print("The middle of linked list is: "+middleOfLinkedList(first));

    }
}
