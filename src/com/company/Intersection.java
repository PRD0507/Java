package com.company;

public class Intersection {

    public Node getIntersectionNode(Node headA, Node headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        if (lenA > lenB) {
            return intersection(lenA - lenB, headA, headB);
        } else {
            return intersection(lenB - lenA, headB, headA);
        }
    }

    public Node intersection(int diff, Node big, Node small){

        for(int i = 0; i< diff; i++){
            big = big.next;
        }

        while(big!=small){
            big = big.next;
            small = small.next;
        }

        return big;
    }

    public int getLength(Node head){
        int count=0;

        if(head == null){
            return 0;
        }
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

}
