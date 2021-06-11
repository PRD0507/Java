package com.company;

public class RemoveFromEnd {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    //Enter the position of the node to be removed from the end

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        if(head == null){
            return null;
        }

        int len = getLength(head);

        ListNode node = head;
        ListNode prev = head;

        if(node.next == null){
            head = head.next;
            return head;
        }

        while(count < len-n){
            prev = node;
            node = node.next;
            count++;
        }

        if(len-n == 0){
            head = head.next;
            return head;
        }

        prev.next = node.next;
        return head;
    }

    public int getLength(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count++;
    }

}
