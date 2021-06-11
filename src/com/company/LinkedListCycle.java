package com.company;
import java.util.*;

public class LinkedListCycle {
    public boolean hasCycleHashMap(Node head) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        Node node = head;
        if (node == null) {
            return false;
        }
        while (node.next != null) {

            if (map.containsKey(node.data)) {

                return true;
            } else {
                map.put(node.data, true);
                System.out.println(node.data);
                node = node.next;
            }
        }

        return false;
    }

    public boolean hasCycleTwoPointer(Node head) {
        if (head == null) {
            return false;
        } else {
            Node slow = head;
            Node fast = head.next;
            while (fast != null && fast.next != null) {
                if (slow == fast) {
                    return true;
                }

                slow = slow.next;
                fast = fast.next.next;
            }

            return false;

        }
    }
}
