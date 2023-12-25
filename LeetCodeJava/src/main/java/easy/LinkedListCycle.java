package easy;

import java.util.HashMap;
import java.util.Set;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);
        //head.next.next.next.next = head.next;

        System.out.println(hasCycle(head));

        //ListNode.display(head);
    }

    static boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> arr = new HashMap<>();

        ListNode current = head;
        while (current != null) {
            if (arr.containsKey(current)) {
                return true;
            } else {
                arr.put(current, current.val);
            }
            current = current.next;
        }

        return false;
    }
}
