package LeetCode;

//Time Complexity:O(n+m)Because we traverse both linked lists once.

//Space Complexity:O(1)Because we only use a few pointer variables and do in-place merging.

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        ListNode fifth = new ListNode(1);
        ListNode sixth = new ListNode(2);
        ListNode seventh = new ListNode(4);
        ListNode eighth = new ListNode(6);

        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        eighth.next = null;

        ListNode temp = mergeTwoLists(first, fifth);
        System.out.println("Merged list: ");
        while (temp.next != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print(temp.val);

    }
    // The first way of solving the problem

    // public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    // //result = head of the merged list (chosen from the smaller first node)

    // //temp = last node of the merged list so far

    // //nextNode = pointer moving forward in the list that started as result

    // //prev = pointer to the other list that you “insert” from

    // //So the loop is basically: compare nextNode and prev, and splice nodes from
    // one into the other.

    // if (list1 == null && list2 == null) //if both lists are empty, simply it
    // returns []
    // return null;
    // if (list1 == null) //if only list1 is empty, it returns head of list2
    // return list2;
    // if (list2 == null) //if only list2 is empty, it returns head of list1
    // return list1;
    // ListNode temp, prev, nextNode, result;
    // if (list1.val <= list2.val) { //if list1 starts with a smaller value than
    // list2 or equal as list2, then the merged resulted list starts with list1
    // result = list1;
    // temp = list1;
    // prev = list2;
    // nextNode = list1.next;
    // } else { // if list2 starts with a smaller value than list1, then the merged
    // resulted
    // // list starts with list2
    // result = list2;
    // temp = list2;
    // prev = list1;
    // nextNode = list2.next;
    // }
    // while (nextNode != null && prev != null) {
    // if (nextNode.val <= prev.val) { //based on next node and prev nodes data
    // values we either continue to move in same list or make switches as needed
    // temp.next = nextNode;
    // temp = nextNode;
    // nextNode = nextNode.next;
    // } else {
    // temp.next = prev;
    // temp = prev;
    // prev = nextNode;
    // nextNode = temp.next;
    // }

    // }
    // if (nextNode != null)
    // temp.next = nextNode;
    // else
    // temp.next = prev;
    // return result;
    // }

    // The second way of solving the problem.

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); // a dummy variable used to store the header of merged sort
        ListNode tail = dummy; // a tail is started from dummy and moves forward depending on values

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        tail.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
