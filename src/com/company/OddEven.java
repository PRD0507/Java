package com.company;

public class OddEven {
    if(head == null){
        return null;
    }
    ListNode odd = head;
    ListNode even = head.next;
    ListNode firstEven = head.next;

    while(even!=null && even.next!=null){
        odd.next = even.next;
        even.next = odd.next.next;
        even = even.next;
        odd = odd.next;
    }

    odd.next = firstEven;
        return head;
}
}
