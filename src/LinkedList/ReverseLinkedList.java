package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedList {
    /*
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }*/
    public static ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        while (currNode != null){
            ListNode nextNode = currNode.next; // temporarily store nextNode to work on
            currNode.next = prevNode; // reverse the direction of arrow --> towards the previous node
            // update previous and current nodes
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode ; // since currNode at the end is null by 'currNode=nextNode' code
    }

    public static ListNode reverseList_recursive(ListNode head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversedListHead = reverseList_recursive(head.next);
        head.next.next = head;
        head.next = null;
        return reversedListHead;
    }

    public static void printList (ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static int getLength(ListNode head) {
        int count = 0;
        while(head != null){
            head = head.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        printList(l1);


//        System.out.println("Iterative reversedList:");
//        printList(reverseList(l1));
        System.out.println("Recursive reversedList: ");
        printList(reverseList_recursive(l1));


    }
}
