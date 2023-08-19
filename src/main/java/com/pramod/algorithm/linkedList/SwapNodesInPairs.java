package com.pramod.algorithm.linkedList;

public class SwapNodesInPairs {
    public static void main(String args[])
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        //System.out.println(swapNodesInPairs(head));
        System.out.println(swapNodesInPairsIterative(head));
    }

    private static ListNode swapNodesInPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode first = head , second = head.next;
        first.next = swapNodesInPairs(head.next.next);
        second.next = first;
        return second;
    }
    public static ListNode swapNodesInPairsIterative(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        //initialise the prevNode
        ListNode prevNode = new ListNode(-1) , prehead = prevNode;
        prevNode.next = head;
        ListNode firstNode , secondNode , tempNode;

        //temporary variable to store first and second of every pair
        while(head != null && head.next != null)
        {
            firstNode = head;
            secondNode = head.next;
            tempNode = secondNode.next;
            secondNode.next = firstNode;
            prevNode.next = secondNode;
            //connecting previous node to the second of this pair
            prevNode = firstNode;
            head = tempNode;
            //reinitialising previous node and head for next pair
        }
        prevNode.next = head;
        return prehead.next;

    }
}
