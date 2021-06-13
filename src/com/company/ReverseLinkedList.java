package com.company;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if(head == null){
            return null;
        }
        ListNode node = head;
        ListNode nextNode;

        while(node.next!=null){

            nextNode = node.next;
            node.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;

        }
        return head;

    }
}
