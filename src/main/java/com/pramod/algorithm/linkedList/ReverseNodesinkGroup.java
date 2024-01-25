package com.pramod.algorithm.linkedList;

import java.util.Stack;

public class ReverseNodesinkGroup {

    public static void main(String args[])
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next = new ListNode(5);
        System.out.println(reverseKGroup(head,3));
    }
    private static ListNode reverseKGroup(ListNode head,int k) {


            if (head == null)
                return null;

            ListNode tail = head;

            for (int i = 0; i < k; ++i) {
                // There are less than k nodes in the list, do nothing.
                if (tail == null)
                    return head;
                tail = tail.next;
            }

            ListNode newHead = reverse(head, tail);
            head.next = reverseKGroup(tail, k);
            return newHead;
        }



    private static ListNode reverse(ListNode head, ListNode tail){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != tail) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

        // Reverses [head, tail).


    private static ListNode reverseKGroupUsingStack(ListNode head,int k) {

        ListNode current = head;
        ListNode previous = null;
        while(current!=null){
            Stack stack = new Stack();
            int count= 0;
            while(count<k && current!=null){
                stack.push(current);
                current = current.next;
                count++;

            }

            while(!stack.empty()){

                if(previous==null){
                    previous = (ListNode) stack.pop();
                    head = previous;
                }

                else{
                    previous.next = (ListNode) stack.pop();
                    previous = previous.next;

                }
            }

        }
        previous.next=null;



        return head;


    }


}
