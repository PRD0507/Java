package com.company;

public class PalindromeLL {
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
    public boolean isPalindrome(ListNode head) {

        if(head == null){
            return false;
        }


        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;

        if(head.next == null){
            return true;
        }

        if(head.next.next ==null){
            if(head.val == head.next.val){
                return true;
            }
            return false;
        }

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            // System.out.println(prev.val);
        }
        prev = slow;
        slow = slow.next;

        ListNode node = slow;
        ListNode nextNode;


        while(node.next!=null){

            nextNode = node.next;
            node.next = nextNode.next;
            nextNode.next = slow;
            slow = nextNode;

        }
        prev.next = slow;

        node = head;
        ListNode second = slow;

        while(node.val == slow.val){

            node = node.next;
            slow = slow.next;

            if(slow == null){
                break;
            }
        }

        if(slow == null){
            return true;
        }
        return false;
    }

}
