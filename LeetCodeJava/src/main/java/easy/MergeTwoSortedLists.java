package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    /*
     * Estou fazendo desta forma head.next em diante, porém não é para ser assim;
     * Tem que instancias os valores normais em um outro método.
     * */
    public static void main(String[] args) {
        ListNode head = new ListNode();
        //head.next = new ListNode(2);
        //head.next.next = new ListNode(4);

        ListNode head2 = new ListNode();
        //head2.next = new ListNode(3);
        //head2.next.next = new ListNode(4);

        ListNode.display(head);
        ListNode.display(head2);

        ListNode c = margeTwoList(head, head2);
        ListNode.display(c);
    }

    static ListNode margeTwoList(ListNode list1, ListNode list2) {
        List<Integer> arr = new ArrayList<>();
        while (list1 != null) {
            arr.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            arr.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(arr);

        if (arr.isEmpty()) return null;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int i = 0; i < arr.size(); i++) {
            current.next = new ListNode(arr.get(i));
            current = current.next;
        }

        return dummy.next;
    }
}
