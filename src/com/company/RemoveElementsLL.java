package com.company;

public class RemoveElementsLL {
    public ListNode removeElements(ListNode head, int val) {

        //If head is null
        if(head == null){
            return null;
        }


        while(head!=null && head.val == val){
            head = head.next;
            if(head == null){
                return null;
            }
        }

        ListNode curr = head;

        while(curr.next!=null){

            if(curr.next.val == val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }
}
